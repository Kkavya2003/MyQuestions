import java.util.Arrays;
/*Question:
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the
same.Given an array of numbers arr,return true if the array can be rearranged to form an arithmetic progression.Otherwise
,return false.
 */
//Solution
public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1;i<len-1;i++){
            if(arr[i+1]-arr[i] != diff){
                return false;
            }
        }
        return true;
    }
}
