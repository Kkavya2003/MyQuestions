/*Question:
A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.
 */
//Solution
public class SubstringsofSizeThreewithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        int len = s.length();
        int count = 0;
        char str1 ,str2 ,str3;
        for(int i=0;i<len-2;i++){
            str1 = s.charAt(i);
            str2 = s.charAt(i+1);
            str3 = s.charAt(i+2);
            if(str1!=str2 && str2!=str3 && str3!=str1){
                count++;
            }
        }
        return count;
    }
}
