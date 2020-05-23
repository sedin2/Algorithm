package Programmers;

public class Solution {
    public int solution(int p) {
        int answer = 0;
        for(int i=p+1; i<10000; i++) {
            if(isBeauty(i)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    private boolean isBeauty(int p) {
        boolean answer = true;
        String b = String.valueOf(p);
        String[] c = new String[b.length()];

        for (int i = 0; i < b.length(); i++) {
            c[i] = String.valueOf(b.charAt(i));
        }

        for (int i = 0; i < c.length - 1; i++) {
            answer = true;
            for (int j = i + 1; j < c.length; j++) {
                if (i == j) {
                    continue;
                }
                if (c[i].equals(c[j])) {
                    return false;
                }
            }
        }

        return answer;
    }
}