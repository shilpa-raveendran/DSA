package NumberPattern;

public class Pattern_12 {

    /*                           n==row=4; col=8
     *  1      1        1st row-->  {1,6 spaces, 1} no.spaces= 2n-2i
     *  12    21        2nd row-->  {2,4 spaces, 2}
     *  123  321        3rd row-->  {3,2 spaces, 3}
     *  12344321        4th row-->  {4,0 spaces, 4}
     */

    public static void main(String[] args) {
        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) { // print nos
                System.out.print(j);
            }
            for (int j = 1; j <= 2*n-2*i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1 ; j--) { // print nos
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
