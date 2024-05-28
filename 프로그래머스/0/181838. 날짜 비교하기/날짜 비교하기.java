
import java.time.LocalDate;
class Solution {
    public int solution(int[] date1, int[] date2) {
        LocalDate today = LocalDate.now();
        LocalDate d1 = LocalDate.of(date1[0], date1[1], date1[2]);
        LocalDate d2 = LocalDate.of(date2[0], date2[1], date2[2]);
        if(d1.isBefore(d2))
            return 1;
        
            return 0;
      
    }
}