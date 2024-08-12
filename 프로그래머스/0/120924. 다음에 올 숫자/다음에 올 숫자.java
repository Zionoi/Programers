class Solution {
    public int solution(int[] common) {
        int num1 = common[1] - common[0];
        int num2 = common[2] - common[1];
        int num3 = 0;
        if(num2==num1){
            return common[common.length-1]+(common[1] - common[0]);
        }else if(num1 - num2 == 0){
            num3 = 1;
        }else {
            num3 = num2 / num1;
        }
        
        return common[common.length-1]*num3;   
    }           
}