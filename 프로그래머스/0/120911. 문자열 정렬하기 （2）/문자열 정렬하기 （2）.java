import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] temp = my_string.toLowerCase().toCharArray();
        Arrays.sort(temp);
        return String.valueOf(temp);
    }
}