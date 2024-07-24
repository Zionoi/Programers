import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
       
        int count=0;
        while(arr.length > (int)Math.pow(2,count)){
            count++;
        }
        int[] answer = new int[(int)Math.pow(2,count)];
        Arrays.fill(answer,0);
       
        for(int i = 0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        
        return answer;
    }
}