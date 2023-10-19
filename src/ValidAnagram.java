import java.util.Arrays;

/*Question:
Given two strings s and t, return true if t is an anagram of s, and false otherwise.An Anagram is a word or phrase formed
by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
//Solution
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char []sar = s.toCharArray();
        char []tar = t.toCharArray();

        Arrays.sort(sar);
        Arrays.sort(tar);
        for(int i=0;i<sar.length;i++){
            if(sar[i] != tar[i]){
                return false;
            }
        }
        return true;
    }
}
