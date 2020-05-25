package Programmers;

public class Solution {
    public int solution(String s) {
        int answer = 0;
        if (s.indexOf(0) == '-') {
            s.replace("-", "");
            answer = Integer.parseInt(s) * -1;
        }
        return Integer.parseInt(s);
    }
}