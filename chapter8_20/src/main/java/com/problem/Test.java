package com.problem;

/**
 * Hello world!
 *
 */
public class Test {
    private static int a;
    private int b;

    public static int countUpA() {
        return ++a;
    }

    public int doMethod() {
        return countUpA();
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.print(test.doMethod());
        // The static method countUpA() from the type Test should be accessed in a
        // static way
        System.out.print(" " + test.countUpA());
    }
}
