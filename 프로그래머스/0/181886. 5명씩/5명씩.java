class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int)Math.ceil(names.length/5.0)];
        int idx = 0;
        for(int i=0; i<names.length;i++){
            if(i%5==0){
                answer[idx]=names[i];
                idx++;
            }
        }
        return answer;
    }
}