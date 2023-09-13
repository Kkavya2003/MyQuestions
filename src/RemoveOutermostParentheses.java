/*Question:
A valid parentheses string is either empty "","(" + A + ")",or A + B,where A and B are valid parentheses strings,and +
represents string concatenation.For example,"","()","(())()",and"(()(()))" are all valid parentheses strings.A valid
parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A
and B nonempty valid parentheses strings.Given a valid parentheses string s, consider its primitive decomposition:
s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.Return s after removing the outermost
parentheses of every primitive string in the primitive decomposition of s.
 */
//Solution
public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder Str = new StringBuilder();
        int paren = 1;

        int len = s.length();
        char[] brk = s.toCharArray();
        if (len <= 2) {
            return "";
        }
        for (int i=1;i<len;i++) {
            if (brk[i] == '(') {
                paren++;
                if ( paren > 1) {
                    Str.append('(');
                }
            }
            else {
                if (paren > 1) {
                    Str.append(')');
                }
                paren--;
            }
        }
        return Str.toString();
    }
}
