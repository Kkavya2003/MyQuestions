/*Question:
The power of the string is the maximum length of a non-empty substring that contains only one unique character.
Given a string s, return the power of s.
 */
//Solution
public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int count = 1;
        int max = 1;
        int len = s.length();
        for(int i=0;i<len-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
