package StarPattern;

public class DiamondPattern {

    /* Pattern 1
            rows=9---> (0,2n)
            *           row 1 ---> 1 col  spaces-->4
           * *          row 2 ---> 2 col  spaces-->3
          * * *         row 3 ---> 3 col  spaces-->2
         * * * *        row 4 ---> 4 col  spaces-->1
        * * * * *       row 5 ---> 5 col  spaces-->0
         * * * *        row 6 ---> 4 col  spaces-->1
          * * *         row 7 ---> 3 col  spaces-->2
           * *          row 8 ---> 2 col  spaces-->3
            *           row 9 ---> 1 col  spaces-->4

            row > n --> cols=2n-r
            r<=n --> cols=rows
    */
    /*Pattern 2  n=5; rows=9=2n-1
                              r <= n ; col= 2r+1
     *          row --> 1  | col --> 1  | spaces --> 5
    ***         row --> 2  | col --> 3  | spaces --> 4
   *****        row --> 3  | col --> 5  | spaces --> 3
  *******       row --> 4  | col --> 7  | spaces --> 2
 *********      row --> 5  | col --> 9  | spaces --> 1
  *******       row --> 6  | col --> 7  | spaces --> 2
   *****        row --> 7  | col --> 5  | spaces --> 3
    ***         row --> 8  | col --> 3  | spaces --> 4
     *          row --> 9  | col --> 1  | spaces --> 5

  */

    public static void main(String[] args) {
        //int n=5;
        pattern1(5);
       pattern2(5);

    }

    private static void pattern2(int n) {
        System.out.println("============= Pattern 2 =============");
        int i, j;

        //This loop will print the first half of the diamond pattern
        for (i = 1; i <= n; i++) {

            // This will print whitespaces, 6 spaces in first row
            // 5 spaces in second row and so on
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // This will print the stars after the whitespaces printed
            // by above loop. It will print 1 star in first row, 3 in second
            // 5 in third and so on
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move the cursor to new line after each row
            System.out.println();
        }

        //This loop will print the second half of the diamond pattern
        for (i = n - 1; i > 0; i--) {

            // This will print whitespaces in second half of triangle pattern
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // This will print stars in second half of triangle pattern
            for (j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            // Move the cursor to new line after each row
            System.out.println();
        }
    }

    private static void pattern1(int n) {
        System.out.println("============= Pattern 1 =============");
        for (int row = 1; row < 2*n; row++) {
            int tolColsInRows= row > n ? 2*n - row : row;
            int noOfSpaces = row > n ? row-n : n-row;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col < tolColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
