class Solution {
    public int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        int answer = 0;
       
        for(int i=0; i<num_list.length;i++){
            if(num_list[i]%2==0)
                even.append(num_list[i]);
            else
                odd.append(num_list[i]);
        }
        answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
                
        
        
        return answer;
    }
}