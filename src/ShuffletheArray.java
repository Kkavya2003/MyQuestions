/*Question:
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
/*Solution*/
public class ShuffletheArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] arr = new int[2*n];
            int no = arr.length;
            int j=0;
            for(int i=0;i<no-1;i+=2){
                arr[i]=nums[j++];
                arr[i+1]=nums[n++];
            }
            return arr;
        }
    }

}
