class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        String str = "";
        for(int i=0; i<babbling.length;i++){
            str = babbling[i];
            for(int j=0; j<4; j++){
                if(str.indexOf(word[j])>-1){
                    str = str.replace(word[j], " ");
                    System.out.println(str);
                }
            }
            str = str.replace(" ", "");
            if(str.length()==0){
                answer++;
            }
        }
        
        return answer;
    }
}