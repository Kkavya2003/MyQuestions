/*Question:
Reversing an integer means to reverse all its digits.For example, reversing 2021 gives 1202. Reversing 12300 gives
321 as the leading zeros are not retained.Given an integer num, reverse num to get reversed1, then reverse reversed1
to get reversed2. Return true if reversed2 equals num. Otherwise return false.
 */
//Solution
public class DoubleReversal {
    public boolean isSameAfterReversals(int num){
        int rem=0,sum=0;
        int num1,num2;
        num1=num;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        num2=sum;
        int nrem=0,nsum=0;
        while(sum>0){
            nrem=sum%10;
            nsum=nsum*10+nrem;
            sum/=10;
        }
        if(num1==nsum){
            return true;
        }
        else{
            return false;
        }
    }
}
