/*Question:
You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
Return the number of strings in words that are a prefix of s.
A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence
of characters within a string.
 */
//Solution
public class CountPrefixesofGivenString {
    public int countPrefixes(String[] words, String s) {
        int len = s.length();
        int wlen = words.length;
        int count = 0;
        for(int i=1;i<=len;i++){
            String str = s.substring(0,i);
            for(int j=0;j<wlen;j++){
                if(words[j].equals(str)){
                    count++;
                }
            }
        }
        return count;
    }
}
