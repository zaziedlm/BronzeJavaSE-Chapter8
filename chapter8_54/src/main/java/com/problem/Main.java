package com.problem;

/**
 * Chapter8_54
 *
 */
public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = (x = 2) + x;
        System.out.println(y + ":" + x);
    }
}
