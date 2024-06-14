public class ReverseWords {
    //151. Reverse Words in a String
    /*Example 1:
    Input: s = "the sky is blue"
    Output: "blue is sky the"

    Example 2:
    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.*/

    public static void main(String[] args) {
        //System.out.println(reverseWords("a good   example"));
        //System.out.println(reverseWords1("  hello world  "));
        System.out.println(reverseWords2("  hello s"));
    }

    private static String reverseWords2(String s) {
        char[] str = s.toCharArray();
        char[] reverse = new char[s.length() + 1];
        int i= s.length() - 1;
        int j;
        int k=0;

        while( i >= 0){
            while( i >=0  && str[i] == ' '){
                i--;
            }
            if( i < 0){
                break;
            }
            j = i;
            while( i >= 0 && str[i] != ' '){
                i--;
            }
            for(int x = i+1 ; x <= j ;x++){
                reverse[k++]=str[x];
            }
            reverse[k++]=' ';
        }
        return new String(reverse, 0, k-1);
    }

    private static String reverseWords1(String s) {
        char[] str = s.toCharArray();
        String result="";
        int i=0;
        int n = s.length();
        while(i < n){
            while(i < n && str[i] ==' '){
                i++;
            }
            if(i >= n){
                break;
            }
            int j=i+1;
            while(j < n && str[j] !=' '){
                j++;
            }
            String w= s.substring(i,j);
            if(result.length()==0){
                result=w;
            }else{
                result= w+" "+result;
            }
            i=j+1;
        }
        return result;
    }

    public static String reverseWords(String s) {
        String[] strArr = s.trim().split("\\s+");
        int start = 0;
        int end = strArr.length - 1;

        while (start < end) {
            String temp = strArr[start];
            strArr[start] = strArr[end];
            strArr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", strArr);
    }
}
