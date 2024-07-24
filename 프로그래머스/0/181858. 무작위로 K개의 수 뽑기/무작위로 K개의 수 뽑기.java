import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        Set<Integer> ts = new LinkedHashSet<>();
        for (int num : arr) {
            ts.add(num);
            if(ts.size()==k){
                break;
            }
        } 
        int count=0;
        for(int num : ts){
            answer[count++]=num;      
        }
        return answer;
    }
}