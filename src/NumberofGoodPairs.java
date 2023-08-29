/*Question:
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
/*Solution*/
public class NumberofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            int j = len-1;
            if(j<i){
                j = len-1;
            }
            while(i<j){
                if(nums[i]==nums[j]){
                    count += 1;
                }
                j--;
            }
        }
        return count;
    }
}
