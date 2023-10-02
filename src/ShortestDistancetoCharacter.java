import java.util.ArrayList;
/*Question:
Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length
and answer[i] is the distance from index i to the closest occurrence of character c in s.
The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
 */
//Solution
/*
public class ShortestDistancetoCharacter {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        char wrd[] = s.toCharArray();
        int len = wrd.length;
        for(int i=0;i<len;i++){
            if(wrd[i] == c){
                list.add(i);
            }
        }
        int [] ar = new int[len];
        for(int i=0;i<len;i++){
            int num = Integer.MAX_VALUE;
            for(int j : list){
                num = Math.min(num, Math.abs(i-j));
            }
            ar[i] = num;
        }
        return ar;
    }

}
 */