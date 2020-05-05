package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Map<Integer, Integer> tmp = new HashMap<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (heights[i] < heights[j]) {
                    tmp.put(i, j + 1);
                    break;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (tmp.get(i)==null) {
                answer[i] = 0;
            }
            else {
                answer[i] = tmp.get(i);
            }
        }
        return answer;
    }
}
