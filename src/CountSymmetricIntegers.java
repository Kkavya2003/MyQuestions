/*Question:
You are given two positive integers low and high.An integer x consisting of 2 * n digits is symmetric if the sum of the
first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never
symmetric.Return the number of symmetric integers in the range [low, high].
 */
//solution
public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            if(symmetric(i)){
                count++;
            }
        }
        return count;
    }
    public boolean symmetric(int n){
        String str = String.valueOf(n);
        int len = str.length();
        if (len%2 != 0){
            return false;
        }
        int mid = len/2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0;i<mid;i++){
            sum1+= str.charAt(i)-'0';
            sum2+= str.charAt(len-i-1)-'0';
        }
        return sum1==sum2;
    }
}

