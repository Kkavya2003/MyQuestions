/*Question:
Given a positive integer n, find the pivot integer x such that:
The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.Return
the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index
for the given input.
 */
//Solution
public class PivotInteger {
    public int pivotInteger(int n) {
        int Sum = (n*(n + 1))/ 2;
        int Sum1 = 0;
        for(int i=1;i<=n;i++) {
            Sum1 += i;
            if(Sum-Sum1+i == Sum1) {
                return i;
            }
        }
        return -1;
    }
}
