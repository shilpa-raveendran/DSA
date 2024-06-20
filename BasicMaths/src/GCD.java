public class GCD {
    public static void main(String[] args) {
        int n1=18;
        int n2=12;
        findGCD(n1, n2);
    }

    private static void findGCD(int n1, int n2) {
        int gcd=1;
        int i=2;
        while(i <= Math.min(n1, n2)){
            if((n1 % i ==0) &&(n2 % i ==0) ){
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD of "+n1 +" and "+n2+" is: "+gcd);
    }
}
