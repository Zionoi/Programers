class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx ; i<arr.length;i++){
            if(arr[idx]==1)
                return idx;
            else
                idx++;
        }
        return -1;
    }
}