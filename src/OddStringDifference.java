/*Question:
You are given an array of equal-length strings words. Assume that the length of each string is n.Each string words[i]
can be converted into a difference integer array difference[i] of length n - 1 where difference[i][j] = words[i][j+1]
-words[i][j] where 0 <= j <= n - 2. Note that the difference between two letters is the difference between their
positions in the alphabet i.e. the position of 'a' is 0, 'b' is 1, and 'z' is 25.For example, for the string "acb",
the difference integer array is [2 - 0, 1 - 2] = [2, -1].All the strings in words have the same difference integer array
,except one. You should find that string.Return the string in words that has different difference integer array.
 */
//solution
public class OddStringDifference {
    public String oddString(String[] words) {
        int len = words.length;
        int [][] ans = new int [len][len-1];
        for(int i=0;i<len;i++){
            for(int j=0;j<words[i].length()-1;j++){
                ans[i][j] = words[i].charAt(j+1)-words[i].charAt(j);
            }
        }
        for(int j=0;j<ans[0].length;j++){
            if(ans[0][j] != ans[1][j] && ans[0][j] != ans[2][j]){
                return words[0];
            }
        }
        for(int i=0;i<ans.length-1;i++){
            for(int j=0;j<ans[i].length;j++){
                if(ans[i][j] != ans[i+1][j]){
                    return words[i+1];
                }
            }
        }
        return words[0];
    }
}
