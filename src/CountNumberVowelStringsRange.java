/*Question:
You are given a 0-indexed array of string words and two integers left and right.A string is called a vowel string if
it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].
 */
//Solution
/*
public class CountNumberVowelStringsRange {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            String str = words[i];
            int len = str.length() - 1;
            if((str.charAt(0)=='a'||str.charAt(0)=='e'||str.charAt(0)=='i'||str.charAt(0)=='o'||
                    str.charAt(0)=='u')&&(str.charAt(len)=='a'||str.charAt(len)=='e'||
                    str.charAt(len) =='i'||str.charAt(len)=='o'||str.charAt(len) == 'u')){
                count++;
            }
        }
        return count;

    }

 */