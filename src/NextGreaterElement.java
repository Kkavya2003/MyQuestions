/*Question:
The next greater element of some element x in an array is the first greater element that is to the right of x in the
same array.You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.For
each 0 <= i < nums1.length,find the index j such that nums1[i] == nums2[j] and determine the next greater element of
nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1. Return an array ans of
length nums1.length such that ans[i] is the next greater element as described above.
 */
//Solution
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int count = 0;
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(nums1[i] == nums2[j]){
                    int temp = nums2[j];
                    count=0;
                    while(j<len2-1){
                        j++;
                        if(nums2[j]>temp){
                            nums1[i] = nums2[j];
                            count++;
                            break;
                        }
                    }
                }
            }
            if(count == 0){
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}
