import java.util.Arrays;
/*Question:
Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also
exists in the array.Return the positive integer k. If there is no such integer, return -1.
 */
//solution
public class LargestPositiveIntegerThatExistsWithItsNegative {
    public int findMaxK(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            for(int j=len-1;j>=0;j--){
                if(nums[i]+nums[j]==0){
                    return nums[j];
                }
            }
        }
        return -1;

    }
}
