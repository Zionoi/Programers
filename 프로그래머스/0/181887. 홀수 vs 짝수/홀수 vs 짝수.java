class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hol=0;
        int jjak=0;
        for(int i=0;i<num_list.length;i++){
            if(i%2==0){
                jjak+=num_list[i];
            }else{
                hol+=num_list[i];
            }
        }
        if(jjak == hol){
            return jjak;
        }
        answer = jjak > hol ? jjak : hol;
        return answer;
    }
}