import java.util.Arrays;

/*Question:
Assume you are an awesome parent and want to give your children some cookies.But,you should give each child at most one
cookie.Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be
content. Your goal is to maximize the number of your content children and output the maximum number.
 */
//Solution
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int j=0;j<s.length && count<g.length;j++){
            if(g[count]<=s[j]){
                count++;
            }
        }
        return count;
    }

}
