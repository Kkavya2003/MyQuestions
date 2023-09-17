/*Question:
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from
magazine and false otherwise.Each letter in magazine can only be used once in ransomNote.
 */
//Solution
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        if(len1>len2){
            return false;
        }
        int string [] = new int [26];
        for(int i=0;i<len2;i++){
            string[magazine.charAt(i)-'a']++;
        }

        for(char i :ransomNote.toCharArray()){
            string[i-'a']--;
            if(string[i-'a']<0){
                return false;
            }
        }
        return true;
    }

}
