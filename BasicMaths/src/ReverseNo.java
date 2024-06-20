public class ReverseNo {
    public static void main(String[] args) {
        int n=1234;
        reverseNo(n);
    }
    public static void reverseNo(int n){
        int reverse=0;
        while(n>0){
            int lastDigit= n % 10;
            reverse= (reverse * 10) + lastDigit;
            n = n /10;
        }
        System.out.println("Reverse is: "+reverse);
    }
}
