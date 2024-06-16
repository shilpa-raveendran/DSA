package LetterPattern;

/*
  A
  A B
  A B C
  A B C D
  A B C D E
*/
public class Pattern_14 {
    public static void main(String[] args) {
        int n=5;

        pattern14(n);

        System.out.println("======================");
        /*
        A B C D E
        A B C D
        A B C
        A B
        A
       */
        pattern15(n);

    }

    private static void pattern15(int n) {
        for (int i = n-1; i >=0 ; i--) {
            for (char j = 'A'; j <='A'+i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {
        for (int i = 0; i <n ; i++) {
            for (char j = 'A'; j <='A'+i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
