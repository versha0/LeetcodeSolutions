public class Problem844 {

    /*
    Given two strings s and t, return true if they are equal when both are
    typed into empty text editors. '#' means a backspace character.
    Note that after backspacing an empty text, the text will continue empty
     */
    /*
    Input: s = "ab#c", t = "ad#c"
    Output: true
    Explanation: Both s and t become "ac"

    Input: s = "ab##", t = "c#d#"
    Output: true
    Explanation: Both s and t become "".
     */

    public boolean backspaceCompare(String s, String t) {
        return helper(s).equals(helper(t));
    }

    public String helper(String s){
        int counter=0;
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c=='#'){
                if(counter>0){
                    counter--;
                    str.deleteCharAt(counter); //O(1) as last is removed
                }
            }else{
                str.append(c);
                counter++;
            }
        }
        return str.toString();
    }
}