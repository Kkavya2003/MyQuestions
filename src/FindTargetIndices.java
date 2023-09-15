/*Question:
You are given a 0-indexed integer array nums and a target element target.
A target index is an index i such that nums[i] == target.
Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target
indices, return an empty list. The returned list must be sorted in increasing order.
 */
//Solution
/*
import java.util.ArrayList;
public class FindTargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        int sol=0;
        int no=0;
        for(int num : nums){
            if(num<target){
                no++;
            }
            if(num==target){
                sol++;
            }
        }
        List<Integer> ar = new ArrayList<>();
        for(int i=no;i<no+sol;i++){
            ar.add(i);
        }
        return ar;
    }
}
 */