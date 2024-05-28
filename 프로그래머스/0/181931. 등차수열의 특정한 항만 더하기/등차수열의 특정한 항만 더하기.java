class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        //included 길이만큼 for문 반복 
        for(int i = 0 ; i<included.length; i++ ){
            //inzluded[i]가 true 일때 a+d*i 값만큼 answer에 더해줌
            if(included[i])
                answer += a+d*i; 
            
            
        }
        return answer;
    }
}