package com.problem;

/**
 * Chapter8_15
 *
 */
public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = x++;
        int z = ++y;
        System.out.println(x + " " + y + " " + z);
    }
}
