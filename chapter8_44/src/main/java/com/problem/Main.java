package com.problem;

/**
 * Chapter8_44
 *
 */
public class Main {
    public static void main(String[] args) {
        int x = 12 / 2;
        int y = 2 * 3;

        if (x > y) 
            System.out.println("A");
        else if (x < y) 
            System.out.println("B");
        else if (x = y)   // Type mismatch: cannot convert from int to boolean
            System.out.println("C");
        else {
            System.out.println("D");
        }
    }
}
