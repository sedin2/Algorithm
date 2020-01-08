package com.company;

import Programmers.Solution;

public class Main {
    public static void main(String[] args) {
        Solution answer = new Solution();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(answer.solution(participant, completion));
    }
}
