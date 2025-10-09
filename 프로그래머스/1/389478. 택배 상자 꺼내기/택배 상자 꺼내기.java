class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int totalLow = (n-1)/w + 1;
        int temp = (num-1)/w + 1;
        int a = n%w == 0 ? w : n%w;
        int b = num%w == 0 ? w : num%w;
        if(totalLow%2 == 1 && temp%2 == 0 || totalLow%2 == 0 && temp%2 == 1){
            if(a+b>w) answer++;
        }else if(totalLow%2 == 0 && temp%2 == 0 || totalLow%2 == 1 && temp%2 == 1){
            if(a>=b) answer++;
        }
        answer += totalLow - temp;
        return answer;
    }
}