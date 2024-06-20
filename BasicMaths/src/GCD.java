public class GCD {
    public static void main(String[] args) {
        int n1=18;
        int n2=12;
       int gcd= findGCD_Optimal(n1, n2);
        System.out.println("GCD of "+n1 +" and "+n2+" is: "+gcd);
    }

    //BruteForce
    private static int findGCD(int n1, int n2) {
        int gcd=1;
        int i=2;
        while(i <= Math.min(n1, n2)){
            if((n1 % i ==0) &&(n2 % i ==0) ){
                gcd=i;
            }
            i++;
        }
        return gcd;
    }
    //Better Approach
    public static int findGCD_Better(int n1, int n2) {
    //Iterate from the min(n1,n2) till 1. bcoz the gcd cannot exceed the min(n1,n2)
        for (int i = Math.min(n1,n2); i >=1 ; i--) {
            //check if i is divisible by n1 and n2
            //bcz the gcd lies near to the min(n1, n2)
            if(n1 % i ==0 && n2 %i ==0){
               return i;
            }

        }
        return 1;
    }

    //Optimal Solution - The Euclidean Algorithm
    //the GCD of two numbers remains the same
    // even if the smaller number is subtracted from the larger number.
    private static int findGCD_Optimal(int n1, int n2) {
        while(n1 > 0 && n2 >0){
            if(n1> n2){
                n1= n1%n2;
            }else{
                n2 = n2 % n1 ;
            }
        }
        if(n1 == 0){
            return n2;
        }
        return n1;
    }
}
