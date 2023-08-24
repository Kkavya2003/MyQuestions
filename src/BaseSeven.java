/*Question:
Given an integer num, return a string of its base 7 representation.
 */
/*Solution*/
public class BaseSeven {
    public String convertToBase7(int num) {
        int sum = 0;
        int no = 1;
        while(num != 0){
            int dig = num%7;
            sum+= (dig*no);
            num/= 7;
            no*= 10;
        }
        return "" + sum;
    }
}
