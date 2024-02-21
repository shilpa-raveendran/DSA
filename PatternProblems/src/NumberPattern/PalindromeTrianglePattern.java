package NumberPattern;

public class PalindromeTrianglePattern {
    /*
                                            spaces=
          1                     1 row --> 10 spaces
        2 1 2                   2 row --> 8 spaces
      3 2 1 2 3                 3 row --> 6 spaces
    4 3 2 1 2 3 4               4 row --> 4 spaces
  5 4 3 2 1 2 3 4 5             5 row --> 2 spaces
6 5 4 3 2 1 2 3 4 5 6           6 row --> 0 spaces

*/

    public static void main(String[] args) {
        int n=6;

        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
