/*Question:
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase
letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.
An English letter b is greater than another letter a if b appears after a in the English alphabet.
 */
//Solution
public class GreatestEnglishLetterUpperandLowerCase {
    public String greatestLetter(String s){
        for (int i='z';i>='a';i--){
            String uc = Character.toString(i - 32);
            String lc = Character.toString(i);
            if (s.contains(lc) && s.contains(uc)) {
                return uc;
            }
        }
        return "";
    }
}
