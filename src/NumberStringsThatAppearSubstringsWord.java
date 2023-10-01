/*Quesion:
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a
 substring in word.A substring is a contiguous sequence of characters within a string.
 */
//Solution
public class NumberStringsThatAppearSubstringsWord {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        int len = patterns.length;
        for(int i=0;i<len;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
