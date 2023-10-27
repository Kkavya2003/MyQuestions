/*Question:
You are given a 0-indexed string s consisting of only lowercase English letters, where each letter in s appears exactly
twice. You are also given a 0-indexed integer array distance of length 26.Each letter in the alphabet is numbered from
0 to 25 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, ... , 'z' -> 25).In a well-spaced string, the number of letters between the
two occurrences of the ith letter is distance[i]. If the ith letter does not appear in s, then distance[i] can be
ignored.Return true if s is a well-spaced string, otherwise return false.
 */
//Solution
public class CheckDistancesBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        int[] alph = new int[26];
        int len =  s.length();
        for(int i=0;i<len;i++){
            if(alph[s.charAt(i)-'a']!= 0 && i-alph[s.charAt(i)-'a']
                    !=distance[s.charAt(i) - 'a']){
                return false;
            }
            alph[s.charAt(i)-'a'] = i+1;
        }
        return true;
    }
}
