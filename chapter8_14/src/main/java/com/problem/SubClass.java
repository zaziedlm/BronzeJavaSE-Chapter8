package com.problem;

/**
 * Chapter8_14
 *
 */
public class SubClass extends SuperClass {
    private int a;
    private int b;
    public SubClass(int a) {
        this.a = a;
    }
    public SubClass(int a, int b) {
        this(a);
        this.b = b;
    }
    public static void main(String[] args) {
        SubClass sub = new SubClass(2, 3);
                                // num cannot be resolved or is not a field
        System.out.println(sub.num + ":" + sub.a + ":" + sub.b);
    }
}
