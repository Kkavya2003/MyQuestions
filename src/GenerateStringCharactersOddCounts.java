/*Question:
Given an integer n, return a string with n characters such that each character in such string occurs an odd number of
times.The returned string must contain only lowercase English letters. If there are multiples valid strings, return any
of them.
 */
//Solution
public class GenerateStringCharactersOddCounts {
    public String generateTheString(int n) {
        String str="";
        for(int i=0;i<n;i++){
            if(n%2 != 0){
                str = str+'a';
            }
            else{
                if(i<n-1){
                    str = str+'a';
                }
                else{
                    str = str+'b';
                }
            }
        }
        return str;
    }
}
