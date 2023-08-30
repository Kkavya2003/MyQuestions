/*Question:
You are given an array of strings names, and an array heights that consists of distinct positive integers.
Both arrays are of length n.For each index i, names[i] and heights[i] denote the name and height of the ith person.
Return names sorted in descending order by the people's heights.
 */
//Solution
public class SortthePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        int temp;
        String newtemp;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if (heights[j]<heights[j+1]){
                    temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    newtemp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=newtemp;
                }
            }
        }
        return names;
    }
}
