/*Question:
You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the
following conditions: 0 <= i < j < k < nums.length
nums[i], nums[j], and nums[k] are pairwise distinct.
In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
Return the number of triplets that meet the conditions.
 */
//Solution
public class NumberofUnequalTripletsinArray {
    public int unequalTriplets(int[] nums) {
        int len = nums.length;
        int count = 0;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=i+2;k<len;k++){
                    if(i<j && j<k){
                        if(nums[i]!=nums[j] && nums[j]!=nums[k] && nums[i]!=nums[k]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
