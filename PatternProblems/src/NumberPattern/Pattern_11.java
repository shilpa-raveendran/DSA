package NumberPattern;

public class Pattern_11 {
    /*
    *  1
    *  0 1
    *  1 0 1
    *  0 1 0 1
    *  1 0 1 0 1
    * */
    public static void main(String[] args) {
        // no of outer loops --> 5
        // inner loops --> 1st row-- 1 column
        //                 2nd row --> 2 cols
        //                 3rd row--> 3 cols
        //                 nth row --> n cols
        // pattern only 1 and 0-->
        // for every odd rows starts with 1 and even rows= 0
        // print start and change start after very itertaion; start=1-start
        int n =5;
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if(i %2 != 0){
                start = 1;
            }else{
                start=0;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
