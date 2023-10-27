/*Question:
Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in
string. Otherwise, return false.
 */
//Solution
public class CheckifAllAsAppearsBeforeAllBs {
    public boolean checkString(String s) {
        int len = s.length();
        for(int i=0;i<len-1;i++){
            if(s.charAt(i)=='b'&& s.charAt(i+1)=='a'){
                return false;
            }
        }
        return true;
    }
}
