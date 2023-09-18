/*Question:
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.Return the merged
string.
 */
//Solution
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder word = new StringBuilder();
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            if (i < len1) {
                word.append(word1.charAt(i));
                i++;
            }
            if (j < len2) {
                word.append(word2.charAt(j));
                j++;
            }

        }
        return word.toString();
    }
}
