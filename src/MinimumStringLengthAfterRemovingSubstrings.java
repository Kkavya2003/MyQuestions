/*Question:
You are given a string s consisting only of uppercase English letters.You can apply some operations to this string where
,in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.Return the minimum
possible length of the resulting string that you can obtain.Note that the string concatenates after removing the
substring and could produce new "AB" or "CD" substrings.
 */
//Solution
public class MinimumStringLengthAfterRemovingSubstrings {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);
        while (str.toString().contains("AB") || str.toString().contains("CD")){
            int i = str.indexOf("AB");
            if (i!=-1){
                str.delete(i,i + 2);
            }
            int j = str.indexOf("CD");
            if (j!=-1){
                str.delete(j,j + 2);
            }
        }
        return str.length();
    }
}
