/*Question:
You are given an array of integers nums. You are also given an integer original which is the first number
that needs to be searched for in nums.You then do the following steps:
If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.
 */
//Solution
public interface KeepMultiplyingFoundValuesbyTwo {
    static int findFinalValue(int[] nums, int original) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(nums[i] == original){
                original*= 2;
                return findFinalValue(nums,original);
            }
        }
        return original;
    }
}
