import java.util.Stack;
/*Question:
You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent
and equal letters and removing them.We repeatedly make duplicate removals on s until we no longer can.Return the final
string after all such duplicate removals have been made. It can be proven that the answer is unique.
 */
//solution
public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        String sol = "";
        if (len == 1) {
            return s;
        }
        for(char str: s.toCharArray()) {
            if(!stack.empty() && stack.peek()==str) {
                stack.pop();
            }
            else {
                stack.push(str);
            }
        }
        while(!stack.empty()) {
            sol = stack.pop()+sol;
        }
        return sol;
    }
}
