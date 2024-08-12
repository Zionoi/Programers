class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int [n][n];
        int count = 1, top=0, bottom=n-1, r=n-1, l=0;
        
        int index = n;
        while(count <= n*n){
            for(int i=l;i<=r && count <= n * n;i++){
                answer[top][i] = count++;
            }
            top++;
            for(int i=top;i<=bottom && count <= n * n;i++){
                answer[i][r] = count++;
            }
            r--;
            for(int i=r;i>=l && count <= n * n;i--){
                answer[bottom][i] = count++;            
            }
            bottom--;
            for(int i=bottom;i>=top && count <= n * n;i--){
                answer[i][l] = count++;            
            }          
            l++;
        }
        
        
        return answer;
    }
}