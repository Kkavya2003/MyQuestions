/*Question:
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
/*Solution*/
public class PowerofTwo {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }
        if(n == 0  || n%2 != 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
