/*Question:
Given an integer num, return the number of steps to reduce it to zero.In one step, if the current number is even,
you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
//Solution
public class NumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int num){
        return stepcount(num,0);

    }
    public static int step(int num){
        return stepcount(num,0);
    }
    public static int stepcount(int num,int st){
        if(num ==0){
            return st;
        }
        if(num%2==0){
            return stepcount(num/2,st+1);
        }
        return stepcount(num-1,st+1);
    }
}
