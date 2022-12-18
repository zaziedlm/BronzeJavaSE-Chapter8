package com.problem;

/**
 * chapter8_3
 *
 */
public class Train {
    static String name = "none";

    public Train(String name) {
        // The static field Train.name should be accessed in a static way
        this.name = name;
    }
    public static void main(String[] args) {
                   // The constructor Train() is undefined
        Train t1 = new Train();
        Train t2 = new Train("aline");
                            // The static field Train.name should be accessed in a static way
        System.out.print(t1.name + " " + t2.name);
    }
}
