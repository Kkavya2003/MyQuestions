import java.util.Arrays;

/*Question:
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.Sort
the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do
not appear in arr2 should be placed at the end of arr1 in ascending order.
 */
//solution
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int [] ans= new int[len1];
        int count = 0;
        for(int i=0;i<len2;i++){
            for(int j=0;j<len1;j++){
                if(arr2[i] == arr1[j]){
                    ans[count++] =  arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<len1;i++){
            if(arr1[i]!=-1){
                ans[count++] = arr1[i];
            }
        }
        return ans;
    }
}
