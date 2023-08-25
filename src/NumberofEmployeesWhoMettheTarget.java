/*Question:
There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i]
 in the company. The company requires each employee to work for at least target hours.You are given a
 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
Return the integer denoting the number of employees who worked at least target hours.
 */
/*Solution*/
public class NumberofEmployeesWhoMettheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int count = 0;
        for(int i =0;i<n;i++){
            if(target == 0){
                return n;
            }
            if(hours[i]>=target){
                count++;
            }
        }
        return count;
    }
}
