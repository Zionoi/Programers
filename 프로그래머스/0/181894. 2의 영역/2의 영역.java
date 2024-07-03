import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        if(list.isEmpty()){
           int[] answer = {-1};
            return answer;
        }
        int start = list.get(0);
        int end = list.get(list.size() - 1);
        
        
        if(list.isEmpty()){
           int[] answer = {-1};
            return answer;
        }else{       
            int[] answer = Arrays.copyOfRange(arr,start,(end+1));
            return answer;
        }
        
        
        
    }
}