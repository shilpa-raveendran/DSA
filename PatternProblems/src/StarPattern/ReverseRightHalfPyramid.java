package StarPattern;

public class ReverseRightHalfPyramid {

    /*      ******
            *****
            ****
            ***
            **
            *
     */


    public static void main(String[] args) {
        int n=5;
        //no of rows= n;
        //0th row--> n cols--> 5 cols -----> 5-0=5
        //1st row--> n-1 cols ---> 4 cols ----> 5-1=4
        //2nd row--> n-2 cols;---> 3 cols ---->5-2=3
        //3rd row--> n-3 cols;---> 2 cols
        //4th row--> n-4 cols;---> 1 cols
        //col = 0 ; col <= n-row ; col++
        //print *

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
