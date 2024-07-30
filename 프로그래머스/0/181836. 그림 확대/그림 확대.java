import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int count =0;
        String str[] = {};
        
        for(int i=0;i<picture.length;i++){
            str = picture[i].split("");
            StringBuilder result = new StringBuilder();
            for(int j=0; j<picture[i].length();j++){
                result.append(str[j].repeat(k));
                
                
            }
            for(int l=0;l<k;l++){
                    answer[count++] = result.toString();
                }
        }
        return answer;
    }
}