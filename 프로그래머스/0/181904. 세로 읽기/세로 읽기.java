import java.util.*;
class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder bd = new StringBuilder();
        //문자열을 m값만큼 나눈후 ceil로 무조건 위로 올림 처리
        int len = (int)Math.ceil(my_string.length()/(double)m);
        //나눈 문자열마다 c번째 열에 문자를 빼내기위한 정수변수 생성
        int num = 0;
        //len에서 나온 값 만큼 for문 반복
        for(int i=0;i<len ;i++){
            //charAt으로 글자 추출후 빌더 bd에 추가
            bd.append(my_string.charAt(c+num-1));
            //num을 입력값 m 만큼 반복 더해줌
            num += m;
        } 
        return bd.toString();
    }
}