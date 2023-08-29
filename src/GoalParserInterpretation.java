/*Question:
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()"
and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.
 */
//Solution
public class GoalParserInterpretation {
    public String interpret(String command) {
        int n= command.length();
        String wrd="";
        int i=0;
        while(i<n){
            if(command.charAt(i)=='G'){
                wrd= wrd+"G";
                i++;
            }
            else if(command.charAt(i)=='('&& command.charAt(i+1)==')'&&i<n-1 ){
                wrd= wrd+"o";
                i=i+2;
            }
            else if(command.charAt(i)=='('&& command.charAt(i+1)=='a'&& i<n-3){
                wrd= wrd+"al";
                i=i+4;
            }
        }
        return wrd;
    }
}
