import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<intStrs.length;i++){
            String sb = intStrs[i].substring(s,s+l);
            int parse = Integer.parseInt(sb);
            if(k<parse){
                list.add(parse);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}