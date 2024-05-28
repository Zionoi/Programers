class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
            char currentChar = code.charAt(i);
            
            if (mode == 0) {
                if (currentChar == '1') {
                    mode = 1;
                } else if (i % 2 == 0) {
                    ret.append(currentChar);
                }
            } else { // mode == 1
                if (currentChar == '1') {
                    mode = 0;
                } else if (i % 2 != 0) {
                    ret.append(currentChar);
                }
            }
        }
        
        if (ret.length() == 0) {
            return "EMPTY";
        }
        
        return ret.toString();
    }
}