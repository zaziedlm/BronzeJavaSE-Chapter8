package com.problem;

/**
 * Chapter8_5
 *
 */
public class Main {
    public static void main(String[] args) {
        ISample[] samples = {new A(), new B()};
        for( ISample s : samples) {
            s.test();
        }
    }
}
