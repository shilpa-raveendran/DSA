package StarPattern;

public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n =4;
        //1st loop for each row ; row=1 till row<=n
            //--->loop to print space before stars ; space =1  till n-row --> range(n-row)
            //--->print(space);
            //--->loop to print star; upto the current row no.
            //--->print star;
        for(int row =1 ; row <= n; row++){
            for(int space =1 ; space <= n-row ; space++){
                System.out.print(" ");
            }
            for(int star = 1 ; star <=row; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
