/*Question:
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.
 */
//Solution
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int count = 0;
        int num = 1;
        int i = 0;
        while(i<len && count<k){
            if(arr[i] == num){
                num++;
                i++;
            }
            else{
                count++;
                num++;
            }
        }
        while(count<k) {
            num++;
            count++;
        }
        int sol = num-1;
        return sol;
    }

}
