class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String sNum = num+"";
        char[] NumArray = sNum.toCharArray();
        String sK = k + "";
        String CutSNum;
        for(int i = 0; i<NumArray.length;i++){
            CutSNum = Character.toString(NumArray[i]);
            if(CutSNum.equals(sK)){
                answer = i+1;
                return answer;
            }
        }
            
        return answer;
    }
}