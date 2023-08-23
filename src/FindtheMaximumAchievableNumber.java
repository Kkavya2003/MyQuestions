/*Question:
You are given two integers, num and t.
An integer x is called achievable if it can become equal to num after applying the following operation no
more than t times:
Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
Return the maximum possible achievable number. It can be proven that there exists at least one achievable number.
 */
/*Solution*/
public class FindtheMaximumAchievableNumber {
    class Solution {
        public int theMaximumAchievableX(int num, int t) {
            int x = t;
            while(t>0){
                num = num+1;
                t = t-1;
                if(t==0){
                    num = num+x;
                }
            }
            return num;
        }
    }
}
