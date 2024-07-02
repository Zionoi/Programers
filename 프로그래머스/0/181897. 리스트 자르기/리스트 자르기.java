import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer={};
        
        switch(n){
            case 1 :
                return Arrays.copyOfRange(num_list,0,b+1);
            case 2 :
                return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3 :
                return Arrays.copyOfRange(num_list,a,b+1);
            case 4 : 
                for(int i = a;i<=b;i+=c){
                    list.add(num_list[i]);
                }
                answer = new int[list.size()];
                for(int j = 0; j<list.size();j++){
                    answer[j]= list.get(j);
                } 
                break;
            
           
            
        }
        return answer;
    }
}