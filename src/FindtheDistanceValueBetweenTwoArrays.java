/*Question:
Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.The
distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where
|arr1[i]-arr2[j]| <= d.
 */
//solution
public class FindtheDistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int count = 0;
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    count++;
                    break;
                }
            }
        }
        return (len1-count);
    }
}
