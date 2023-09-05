/*Question:
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd
integers.Return any array that satisfies this condition.
 */
//Solution
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int [] ans = new int [len];
        int j = 0;
        int k = len-1;
        for(int i=0;i<len;i++){
            if(nums[i]%2==0){
                ans[j++] = nums[i];
            }
            else{
                ans[k--] = nums[i];
            }
        }
        return ans;
    }
}
