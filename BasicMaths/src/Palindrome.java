public class Palindrome {
    public static void main(String[] args) {
        int n=121;
        isPalindrome(n);

    }

    private static void isPalindrome(int n) {
        int input= n;
        int reverse=0;

        while(n>0){
            int lastDigit= n %10;
            reverse= (reverse *10 ) + lastDigit;
            n = n/10;
        }
        if(reverse == input){
            System.out.println(input+" is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
