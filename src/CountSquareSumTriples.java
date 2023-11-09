/*Question:
A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.
Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
 */
//Solution
public class CountSquareSumTriples {
    public int countTriples(int n) {
        int count = 0;
        for(int i = 1;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n+1;k++){
                    if(i*i + j*j == k * k){
                        count += 2;
                    }
                }
            }
        }
        return count;
    }
}
