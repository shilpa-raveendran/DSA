import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    //345. Reverse Vowels of a String
    /*Example 1:
    Input: s = "hello"
    Output: "holle"

    Example 2:
    Input: s = "leetcode"
    Output: "leotcede"*/

    public static void main(String[] args) {
        //String s="A man, a plan, a cameo, Zena, Bird, Mocha, Prowel, a rave, Uganda, Wait, a lobola, Argo, Goto, Koser, Ihab, Udall";
        String s="leetcode";
        System.out.println(reverseVowels2(s));
    }
    static  String reverseVowels2(String s){
        char[] strArr= s.toCharArray();
        char[] vowels= "aeiouAEIOU".toCharArray();
        int start =0;
        int end= s.length()-1;

        while(start < end){
            if(!checkVowels(strArr[start])){
                start++;
            }
            if(!checkVowels(strArr[end])){
                end--;
            }
            if(checkVowels(strArr[end]) && checkVowels(strArr[start])){
                char temp=strArr[start];
                strArr[start]=strArr[end];
                strArr[end]=temp;
                start++;
                end--;
            }

        }
        return new String(strArr);
    }

    private static boolean checkVowels(char a) {
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
                || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') ? true : false;
    }

    public static String reverseVowels1(String s) {
        Set<Character> vowels=new HashSet<Character>(10);
        char[] strArr= s.toCharArray();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int start =0;
        int end= s.length()-1;

        while(start < end){
            if(!vowels.contains(s.charAt(end))){
                end--;
                continue;
            }
            if(!vowels.contains(s.charAt(start))){
                start++;
                continue;
            }
            char temp=strArr[start];
            strArr[start]=strArr[end];
            strArr[end]=temp;
            start++;
            end--;

        }
        return new String(strArr);
    }

}
