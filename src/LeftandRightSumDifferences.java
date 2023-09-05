/*Question:
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:
leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element,
leftSum[i] = 0.rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no
such element, rightSum[i] = 0.Return the array answer.
 */
//Solution
public class LeftandRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int [] answer = new int[len];
        int [] rsum = new int[len];
        int sum = 0;
        for(int i=0;i<len;i++){
            answer[i] = sum;
            sum += nums[i];
        }
        for(int i = len-2;i>=0;i--){
            rsum[i] = rsum[i+1]+nums[i+1];
        }
        for(int i=0;i<len;i++){
            answer[i] = Math.abs(answer[i]-rsum[i]);
        }
        return answer;
    }
}
