/*Question:
Given an array nums of size n, return the majority element.The majority element is the element that appears more than
⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
//solution
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count>n/2){
                max = nums[i];
            }
        }
        return max;
    }
}
