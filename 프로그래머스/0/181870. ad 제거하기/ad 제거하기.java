import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] strArr) {
        int s = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].indexOf("ad")==-1){
                list.add(strArr[i]);
            }
        }
        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}