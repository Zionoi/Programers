class Solution {
    public int solution(String binomial) {
        String[] parts;
        int answer = 0;
        
        if (binomial.contains("+")) {
            parts = binomial.split(" \\+ ");
            answer = Integer.parseInt(parts[0].trim()) + Integer.parseInt(parts[1].trim());
        }
        else if (binomial.contains("-")) {
            parts = binomial.split(" \\- ");
            answer = Integer.parseInt(parts[0].trim()) - Integer.parseInt(parts[1].trim());
        }
        else if (binomial.contains("*")) {
            parts = binomial.split(" \\* ");
            answer = Integer.parseInt(parts[0].trim()) * Integer.parseInt(parts[1].trim());
        }
        else if (binomial.contains("/")) {
            parts = binomial.split(" / ");
            answer = Integer.parseInt(parts[0].trim()) / Integer.parseInt(parts[1].trim());
        }

        return answer;
    }
}
