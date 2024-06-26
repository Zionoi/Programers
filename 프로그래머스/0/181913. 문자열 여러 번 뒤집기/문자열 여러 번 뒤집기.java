class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);
        int s=0;
        int e=0;
        
        for(int[] q : queries){
            s = q[0];
            e = q[1];
            String re = new StringBuilder(sb.substring(s,e+1)).reverse().toString();
            sb.replace(s,e+1,re);
        }
        return sb.toString();
    }
}