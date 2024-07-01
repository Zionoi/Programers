import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        
        int i = 1;
        ArrayList<Integer> list = new ArrayList<>();
        while(i<=n){
            if(i%k==0){
                list.add(i);
            }
            i++;    
        }    
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++)    
            answer[j] = list.get(j);
        return answer;
    }
}