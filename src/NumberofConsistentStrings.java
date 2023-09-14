/*Question:
You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent
if all characters in the string appear in the string allowed.Return the number of consistent strings in the array words.
 */
//Solution
public class NumberofConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int len = allowed.length();
        int size = words.length;
        int count=0;
        boolean[] ar = new boolean[26];
        for(int i=0;i<len;i++){
            ar[allowed.charAt(i)-'a'] = true;
        }
        for(int i=0;i<size;i++){
            String alph = words[i];
            int temp = 0;
            while(temp<alph.length()){
                char wrd = alph.charAt(temp);
                if(!ar[wrd-'a']){
                    break;
                }
                temp++;
            }
            if(temp>=alph.length()){
                count++;
            }
        }
        return count;

    }
}
