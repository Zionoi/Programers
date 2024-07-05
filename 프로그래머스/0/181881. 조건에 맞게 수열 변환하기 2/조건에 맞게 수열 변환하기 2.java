import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        boolean result = false;
        int[] copy = Arrays.copyOf(arr,arr.length);
        while(!result){
            copy = Arrays.copyOf(arr,arr.length);
            for(int i = 0;i<arr.length;i++){
                if(copy[i]>=50 && copy[i]%2 ==0){
                    copy[i]= copy[i]/2;
                }else if(copy[i]<=50 && copy[i]%2 !=0){
                    copy[i]=copy[i]*2+1;
                }
            }
            if(Arrays.equals(arr, copy)){
                    return count;
            }
            arr = Arrays.copyOf(copy,copy.length);
            count++;
            
        }
        return count;
        
    }
}