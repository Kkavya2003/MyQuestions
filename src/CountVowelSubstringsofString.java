import java.util.ArrayList;
/*Question:
A substring is a contiguous (non-empty) sequence of characters within a string.A vowel substring is a substring that
only consists of vowels ('a', 'e', 'i', 'o', and 'u') and has all five vowels present in it.Given a string word, return
the number of vowel substrings in word.
 */
//Solution
public class CountVowelSubstringsofString {
    public int countVowelSubstrings(String word) {
        int count=0;
        int len = word.length();
        for(int i=0;i<len;i++){
            ArrayList<Character> list = new ArrayList<>();
            for(int j=i;j<len;j++){
                char vowel = word.charAt(j);
                if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u'){
                    list.add(vowel);
                }
                else{
                    break;
                }
                if(list.size()>=5&&list.contains('a')&&list.contains('e')&&
                        list.contains('i')&&list.contains('o')&&list.contains('u')){
                    count++;
                    System.out.println(list);}
            }
        }
        return count;
    }

}
