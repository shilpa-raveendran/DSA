import java.util.ArrayList;
import java.util.Comparator;

public class PrintAllDivisors {
    static int count = 0;
    public static void main(String[] args) {
        int n = 36;
       // ArrayList<Integer> divisorsList= bruteForce(n);
        ArrayList<Integer> divisorsList= optimalSolution(n);
        divisorsList.sort(Comparator.naturalOrder());
        for (int divisor : divisorsList) {
            System.out.print(divisor + " ");
        }
    }
    public static ArrayList<Integer> bruteForce(int n){
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <=n ; i++) {
            if(n % i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static ArrayList<Integer> optimalSolution(int n){
        //if d is divisible by n then n/d should also be divisible
        // Iterate from 1 to square root of n
        //int[] divisors = new int[n];
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if( n % i ==0){
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }
}
