/*Question:
You are given a 0-indexed string num of length n consisting of digits.Return true if for every index i in the range
0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.
*/
//solution
public class CheckNumberHasEqualDigitCountandDigitValue {
    public boolean digitCount(String num) {
        int n = num.length();
        int []ar = new int[10];
        for(int i=0;i<n;i++){
            ar[num.charAt(i)-'0']+= 1;
        }
        for(int i=0;i<n;i++){
            if(ar[i] != num.charAt(i)-'0'){
                return false;
            }
        }

        return true;
    }
}
