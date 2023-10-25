/*Question:
You are given a string s of even length. Split this string into two halves of equal lengths,and let a be the first half
and b be the second half.Two strings are alike if they have the same number of vowels ('a','e','i','o','u','A','E','I',
'O','U').Notice that s contains uppercase and lowercase letters.Return true if a and b are alike.Otherwise,return false.
 */
//Solution
public class DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        String str1 = "";
        String str2 = "";
        char ch1;
        char ch2;
        int len = s.length();
        for(int i=0;i<len/2;i++){
            ch1 = s.charAt(i);
            str1 = ch1 + str1;
        }
        for(int i=(len/2);i<len;i++){
            ch2 = s.charAt(i);
            str2 = ch2 + str2;
        }
        str1 = str1.toUpperCase();
        int count1 =0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)=='A'||str1.charAt(i)=='E'||str1.charAt(i)=='I'||
                    str1.charAt(i)=='O'||str1.charAt(i)=='U'){
                count1++;
            }
        }
        str2 = str2.toUpperCase();
        int count2 =0;
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)=='A'||str2.charAt(i)=='E'||str2.charAt(i)=='I'||
                    str2.charAt(i)=='O'||str2.charAt(i)=='U'){
                count2++;
            }
        }
        if(count1 == count2){
            return true;
        }
        return false;
    }

}
