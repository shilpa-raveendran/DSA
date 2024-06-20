public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        System.out.println(n+" is Armstrong: "+isArmstrong(n));
    }

    private static boolean isArmstrong(int n) {
        //n= sum of the cubed digits
        //371= cube of 3+ cube of 7 + cube of 1;
        double dupOfInput=Double.valueOf(n);
        double sumOfCubes=0;
        while(n>0) {
            double digits = n % 10;
            sumOfCubes = sumOfCubes + Math.pow(digits, 3.0);
            n = n/ 10;
        }
        if(sumOfCubes == dupOfInput){
            return true;
        }
        return false;
    }
}
