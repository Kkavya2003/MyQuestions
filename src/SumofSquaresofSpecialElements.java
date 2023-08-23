/*Question:
You are given a 1-indexed integer array nums of length n.
An element nums[i] of nums is called special if i divides n, i.e. n % i == 0.
Return the sum of the squares of all special elements of nums.
 */
/*Solution*/
public class SumofSquaresofSpecialElements {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(n%(i+1) == 0){
                int prd = nums[i]*nums[i];
                sum += prd;
            }
        }
        return sum;
    }
}
