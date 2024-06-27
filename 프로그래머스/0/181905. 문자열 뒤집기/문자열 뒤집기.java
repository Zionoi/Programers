class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string.substring(s, e+1));
        answer+= my_string.substring(0,s);
        answer+= sb.reverse().toString();
        answer+= my_string.substring(e+1);
        return answer;
    }
}