/*Question:
The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -> 0, 'b' -> 1, 'c' -> 2, etc.).
The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each
letter in s, which is then converted into an integer.For example, if s = "acb", we concatenate each letter's letter value
,resulting in "021". After converting it, we get 21.You are given three strings firstWord,secondWord,and targetWord,each
consisting of lowercase English letters 'a' through 'j' inclusive.Return true if the summation of the numerical values of
firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
 */
//Solution
public class CheckWordEqualsSummationTwoWords {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int first = 0;
        int second = 0;
        int target = 0;
        for(char wrd : firstWord.toCharArray()){
            first += wrd - 'a';
            first *= 10;
        }
        for(char wrd : secondWord.toCharArray()){
            second += wrd - 'a';
            second *= 10;
        }
        for(char wrd : targetWord.toCharArray()){
            target += wrd - 'a';
            target *= 10;
        }
        if((first + second)== target){
            return true;
        }
        return false;
    }

}
