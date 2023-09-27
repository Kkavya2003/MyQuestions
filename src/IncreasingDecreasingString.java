/*Question:
You are given a string s. Reorder the string using the following algorithm:
Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and
append it to the result.
Return the result string after sorting s with this algorithm.
 */
//Solution
public class IncreasingDecreasingString {
    public String sortString(String s) {
        int[] str = new int[26];
        int len1 = s.length();
        for (int i = 0; i < len1; i++) {
            int chr = s.charAt(i) - 'a';
            str[chr] = str[chr] + 1;
        }
        StringBuilder s2 = new StringBuilder();
        int len2 = s2.length();
        while (len2 < len1) {
            for (int i = 0; i < 26; i++) {
                if (str[i] > 0) {
                    char ch = (char) ('a' + i);
                    s2.append(ch);
                    str[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (str[i] > 0) {
                    char ch = (char) ('a' + i);
                    s2.append(ch);
                    str[i]--;
                }
            }
        }

        return s2.toString();
    }
    }
