import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0; i<quiz.length; i++){
            String[] str = quiz[i].split(" ");
            int x = Integer.parseInt(str[0]);
            String opt = str[1];
            int y = Integer.parseInt(str[2]);
            int z = Integer.parseInt(str[4]);
            
            int calculate = opt.equals("+") ? (x+y) : (x-y);
            answer[i] = (calculate == z) ? "O" : "X";
            }
        return answer;
    }
}