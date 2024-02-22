package NumberPattern;
/*     n=4
4 4 4 4 4 4 4  4--> (0,0),(0,1),(0,2)...(0,6),(1,0),(1,6),(2,0),(2,6)
4 3 3 3 3 3 4  3--> (1,1)(1,2),(1,3),(3,5)
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4

* */
public class NumberSquareFillPattern {
    public static void main(String[] args) {
        int n=4;
        for (int row = 1; row <= 2*n-1 ; row++) {
            for (int col = 1; col <= 2*n-1; col++) {
                int value = n- Math.min(Math.min(row,col), Math.min(2*n-row,2*n-col))+1;
                System.out.print(value+" ");
            }
            System.out.println("");
        }
    }
}
