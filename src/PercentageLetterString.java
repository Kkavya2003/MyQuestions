/*Question:
Given a string s and a character letter, return the percentage of characters in s that equal letter
rounded down to the nearest whole percent.
 */
//Solution
public class PercentageLetterString {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int percentage = 0;
        int count = 0;
        for(int i=0;i<len -1;i++){
            if(letter == s.charAt(i)){
                count++;
            }
        }
        percentage = (count*100)/len;
        return percentage;
    }
}
