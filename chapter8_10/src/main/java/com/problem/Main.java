package com.problem;

/**
 * Chapter8_10
 *
 */
public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        if (a >= 10 || b >= 10) {
            a /= 2;
            b += a;
        } else
            a /= 2;
            b += a;
        System.out.println(a + ":" + b);
    }
}
