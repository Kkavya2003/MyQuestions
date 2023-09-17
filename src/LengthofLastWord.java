/*Question:
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 */
//Solution
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        int count = 0;
        for(int i= len-1 ;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                if(count>0){
                    return count;
                }
            }
        }
        return count;
    }

}
