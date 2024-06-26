
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //모두 같을때
        if (a == b && b == c && c == d) {
            answer = a * 1111;
            // 3개만 같을때
        } else if ((a == b && b == c && c != d) || 
                   (a == b && b == d && d != c) || 
                   (a == c && c == d && d != b) || 
                   (b == c && c == d && d != a)) {
            if (a == b && b == c && c != d) {
                answer = (int) Math.pow(10 * a + d,2);
            } else if (a == b && b == d && d != c) {
                answer = (int) Math.pow(10 * a + c,2);
            } else if (a == c && c == d && d != b) {
                answer = (int) Math.pow(10 * a + b,2);
            } else if (b == c && c == d && d != a) {
                answer = (int) Math.pow(10 * b + a,2);
            }
            //2개씩 같을때
        } else if ((a == b && c == d && a != c) ||
                   (a == d && b == c && a != b) ||
                   (a == c && b == d && a != b)) {
            if (a == b && c == d && a != c) {
                answer = (a + c) * Math.abs(a - c);
            } else if (a == d && b == c && a != b) {
                answer = (a + b) * Math.abs(a - b);
            } else if (a == c && b == d && a != b) {
                answer = (a + b) * Math.abs(a - b);
            }
            // 2개만같고 나머지 다를때
        } else if ((a == b && b != c && c != d) ||
                   (a == c && b != d && d != a) ||
                   (a == d && a != b && c != b) ||
                   (b == c && b != d && d != a) ||
                   (b == d && b != a && a != c) ||
                   (c == d && c != a && a != b)) {
            if (a == b && b != c && c != d) {
                answer = c * d;
            } else if (a == c && b != d && d != a) {
                answer = b * d;
            } else if (a == d && a != b && c != b) {
                answer = b * c;
            } else if (b == c && b != d && d != a) {
                answer = a * d;
            } else if (b == d && b != a && a != c) {
                answer = a * c;
            } else if (c == d && c != a && a != b) {
                answer = a * b;
            }
        } else {
            answer = Math.min(Math.min(Math.min(a, b), c), d);
        }

        return answer;
    }
}