import java.util.ArrayList;
import java.util.Collections;
/*Question:
The value of an alphanumeric string can be defined as:
The numeric representation of the string in base 10, if it comprises of digits only.
The length of the string, otherwise.
Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
 */
//Solution
public class MaximumValueofaStringinanArray {
    public int maximumValue(String[] strs) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(String s : strs){
            int num1 = 0;
            int num2 = 0;
            int len = s.length();
            for(int i=0; i<len; i++){
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    num1++;
                }
                else{
                    num2++;
                }
            }
            count = Integer.MIN_VALUE;
            if(num2 == len){
                int n = Integer.parseInt(s);
                list.add(n);
            }
            else{
                list.add(len);
            }

        }
        return Collections.max(list);
    }
}
