/*Question:
Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter
from 'a' to 'z' between word1 and word2 is at most 3.Given two strings word1 and word2, each of length n,return true if
word1 and word2 are almost equivalent, or false otherwise.The frequency of a letter x is the number of times it occurs
in the string.
 */
//Solution
public class CheckWhetherTwoStringsareAlmostEquivalent {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] ans = new int[26];
        int len = word1.length();
        for(int i=0;i<len;i++){
            ans[word1.charAt(i) - 'a']++;
            ans[word2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26;i++){
            if(ans[i]> 3 || ans[i]<-3 ){
                return false;
            }
        }
        return true;
    }
}
