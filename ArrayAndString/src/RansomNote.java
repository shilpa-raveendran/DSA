public class RansomNote {
    /*
    * LC:383 Ransom Note
    * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false
*
Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
    * */
    public static void main(String[] args) {
        String ransomNote="aa";
        String  magazine = "ab";
        System.out.println(canConstruct(ransomNote,magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] count = new int[26];


        for(char c : magazine.toCharArray()){
            count[c-'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(count[c-'a'] == 0) {
                return false;
            }else{
                count[c-'a']--;
            }

        }
        return true;
    }
}
