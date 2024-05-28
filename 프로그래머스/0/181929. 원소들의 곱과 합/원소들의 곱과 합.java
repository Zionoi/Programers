class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        int i=0;
        
        for(int li : num_list){
            sum += num_list[i]; 
            i++;
        }
        for(i = 0; i<num_list.length; i++){
         mul *= num_list[i];
        }
        answer = mul > (sum*sum) ? 0 : 1;
        return answer;
    }
}