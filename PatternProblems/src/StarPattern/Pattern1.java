package StarPattern;
/*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
*/
public class Pattern1 {
    public static void main(String[] args) {
        int n =5;

        for (int row = 0; row < 2*n; row++) {
//            if(row > n){
//
//                for (int col = 0; col < 2*n-row ; col++) {
//                    System.out.print("* ");
//                }
//
//            }else{
//                for (int col = 0; col < row; col++) {
//                    System.out.print("* ");
//                }
//            }

            //ternary operation;
            int totalColsInRows = row > n ? 2*n-row : row;
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
