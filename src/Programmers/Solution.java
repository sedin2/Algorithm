package Programmers;

public class Solution {
    public String solution(int n) {
        String answer = "";
        int tmp;
        while (n > 0) {
            tmp = n%3;
            n = n/3;

            if(tmp == 0) {
                n -= 1;
                tmp = 4;
            }
            answer = tmp + answer;
        }
        return answer;
    }
}
