/*Question:
Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
 */
//Solution
public class RemoveTrailingZerosFromString {
    public String removeTrailingZeros(String num) {
        int len = num.length()-1;
        for(int i=len;i>0;i--){
            if(num.charAt(i) != '0'){
                break;
            }
            len--;
        }
        return num.substring(0,len+1);
    }
}
