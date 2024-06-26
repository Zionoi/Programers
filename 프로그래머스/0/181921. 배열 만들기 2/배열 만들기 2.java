import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l ; i<=r; i++){
            if(f(i)){
                list.add(i);
            }
        
        }
        if(list.isEmpty())
            list.add(-1);
        int[] answer = new int[list.size()];
        for(int i =0 ; i<answer.length;i++){
        answer[i]=list.get(i); 
        }
        
        return answer;
    }
    public static boolean f(int i){
//    if(i==0) return true;
    
    while(i>0){
        int five = i%10;
        if(five != 5 && five != 0){
            return false;}
        
        i /= 10;
    }
    return true;
}
}




