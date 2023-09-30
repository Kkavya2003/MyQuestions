/*Question:
Given a string s consisting of lowercase English letters, return the first letter to appear twice.
Note:
A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.
 */
//Solution
public class FirstLettertoAppearTwice {
    public char repeatedCharacter(String s) {
        int len = s.length();
        int[] occ = new int[26];
        for (int i=0;i<len;i++){
            occ[s.charAt(i) -'a']++;
            if(occ[s.charAt(i) - 'a'] == 2){
                return s.charAt(i);
            }
        }
        return 'a';
    }
}
