package com.problem;

/**
 * Chapter8_25
 *
 */
public class Main {
    public static void main(String[] args) {
        boolean flag = false;

        if (flag == true) {
            for (int i = 0; flag; i++) {
                System.out.print("a");
                flag = false;
            }
        } else {
            System.out.print("b");
        }
    }
}
