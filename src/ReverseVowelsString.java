/*Question:
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */
//Solution
public class ReverseVowelsString {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String vowels = "AEIOUaeiou";
        while(start<end) {
            while (start<end&&vowels.indexOf(word[end])==-1) {
                end--;
            }
            while(start<end&&vowels.indexOf(word[start])==-1){
                start++;
            }
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        String answer = new String(word);
        return answer;
    }
}
