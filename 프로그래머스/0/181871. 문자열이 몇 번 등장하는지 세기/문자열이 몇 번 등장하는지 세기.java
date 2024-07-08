class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        int count = 0;
        for(int i=0; i <= myString.length() - pat.length();i++){
            answer = myString.substring(i,i+pat.length());
            if(answer.equals(pat)){
                count++;
            }
            System.out.println(answer);
        }
        return count;
    }
}