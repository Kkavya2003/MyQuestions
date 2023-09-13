/*Question:
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is
valid.An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
//Solution
/*
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch =='('){
                stack.push(')');
            }
            else if (ch =='{'){
                stack.push('}');
            }
            else if (ch =='['){
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop()!=ch){
                return false;
            }

        }
        return stack.isEmpty();
    }
}

 */
