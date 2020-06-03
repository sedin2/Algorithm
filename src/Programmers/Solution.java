package Programmers;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            clothMap.put(clothes[i][1], clothMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(int val : clothMap.values()) {
            answer *= val+1;
        }

        return answer-1;
    }
}
