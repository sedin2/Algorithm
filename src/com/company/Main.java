package com.company;

import Leetcode.Solution;

public class Main {
    public static void main(String[] args) {
        Solution answer = new Solution();
        //String[] participant = {"mislav", "stanko", "mislav", "ana"};
        //String[] completion = {"stanko", "ana", "mislav"};

        //System.out.println(answer.solution(participant, completion));
        System.out.println(answer.reverse(-123));
        System.out.println(answer.reverse(-120));
        System.out.println(answer.reverse(123));
        System.out.println(answer.reverse(120));
        System.out.println(answer.reverse(0));
    }
}
