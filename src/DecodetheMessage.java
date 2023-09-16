/*Question:
You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps
to decode message are as follows:
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we
have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 */
//Solution
public class DecodetheMessage {
    public String decodeMessage(String key, String message) {
        int len = key.length();
        len = message.length();
        String str = "";
        ArrayList<Character> list= new ArrayList<>();
        for(int i=0;i<len;i++){
            char chr = key.charAt(i);
            if(list.indexOf(c)==-1 && c!=' '){
                list.add(c);
            }
        }
        for(int i=0;i<len;i++){
            char chr = message.charAt(i);
            if(c == ' ') {
                str += " ";
                continue;
            }
            int index = list.indexOf(c);
            str +=(char) ('a' + index);
        }
        return str;
    }
}
