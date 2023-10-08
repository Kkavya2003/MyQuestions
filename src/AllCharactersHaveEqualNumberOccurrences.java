/*Question:
Given a string s, return true if s is a good string, or false otherwise.A string s is good if all the characters that
appear in s have the same number of occurrences (i.e., the same frequency).
 */
//Solution
public class AllCharactersHaveEqualNumberOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int len = s.length();
        int frequency [] = new int [26];
        int flen = frequency.length;
        for(int i=0;i<len;i++){
            frequency[s.charAt(i)-'a']++;
        }
        int occ = 0;
        for(int i:frequency){
            occ = Math.max(occ,i);
        }
        for(int i=0;i<flen;i++){
            if( (frequency[i]!=0) && (occ!=frequency[i])){
                return false;
            }
        }
        return true;
    }
}
