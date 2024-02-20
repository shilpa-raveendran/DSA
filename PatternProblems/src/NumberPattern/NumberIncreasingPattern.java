package NumberPattern;

public class NumberIncreasingPattern {

  /*        1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
  */

    public static void main(String[] args) {
        int n=5;
        for (int row = 1; row <= n; row++) {
            //1st row ---> 1 col
            //2nd row ---> 2 cols
            //3rd row ---> 3 cols
            //4th row ---> 4 cols;
            //5th row ---> 5 cols;
            //col <=row

            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
