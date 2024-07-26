import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> strHMap = new HashMap<>(); 
// 문자열 배열을 순회하며 각 문자열의 길이에 따른 빈도수를 계산
        for(int i=0; i<strArr.length;i++){
            int len = strArr[i].length();
// .getOrDefault(a,b) : 지정된 키가 해시맵에 존재하는 경우 해당 키와 연결된 값을 반환하고, 그렇지 않은 경우 기본값 b를 반환하는 메서드
            strHMap.put(len, strHMap.getOrDefault(len, 0) + 1);
        }
        int max = 0;
// 해시맵의 값들을 순회하며 가장 큰 빈도수를 찾음
        for(Integer str : strHMap.values()){
            if(str>max){
                max = str;
            }
        }
        
        return max;
    }
}
