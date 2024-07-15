import java.util.*;

class Solution {
    public String[] solution(String myString) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                str.append(myString.charAt(i));
            } else if (myString.charAt(i) == 'x' && str.length() > 0) {
                list.add(str.toString());
                str.setLength(0);  // StringBuilder를 비웁니다.
            }
        }
        
        // 마지막 부분 처리
        if (str.length() > 0) {
            list.add(str.toString());
        }

        // 리스트 정렬
        Collections.sort(list);

        // 빈 문자열 걸러내기
        List<String> filteredList = new ArrayList<>();
        for (String s : list) {
            if (!s.isEmpty()) {
                filteredList.add(s);
            }
        }

        // 결과를 배열로 변환
        String[] answer = new String[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            answer[i] = filteredList.get(i);
        }
        
        return answer;
    }
}
