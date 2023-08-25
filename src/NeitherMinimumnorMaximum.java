/*Question:
Given an integer array nums containing distinct positive integers,find and return any number from
 the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.
Return the selected integer.
 */
/*Solution*/
public class NeitherMinimumnorMaximum {
    public int findNonMinOrMax(int[] nums){
        int len = nums.length;
        int count = 0;
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<len;i++){
            if(max<nums[i]){
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]!=max && nums[i]!=min){
                count++;
            }
            if(count == 1){
                return nums[i];
            }
        }
        if(count == 0){
            return -1;
        }

        return count;
    }
}
