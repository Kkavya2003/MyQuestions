/*Question:
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
 */
/*Solution*/
public class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        int n= s.length();
        int sol=0;
        int r=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                r++;
            }
            if(s.charAt(i)=='L'){
                l++;
            }
            if(r==l){
                sol++;
            }
        }
        return sol;
    }
}
