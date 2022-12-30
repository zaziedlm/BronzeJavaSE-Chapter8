package com.problem;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        String str = "null";
        
        if (str == null) {
            System.out.println("null");     // Dead code
        } else if (str.length() == 0) {
            System.out.println("0");
        } else {
            System.out.println("other");
        }

    }
}
