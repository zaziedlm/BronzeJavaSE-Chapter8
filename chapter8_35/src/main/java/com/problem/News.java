package com.problem;

/**
 * Chapter8_35
 *
 */
public class News {
    static int id;
    String name;

    static void printinfo() {
        // Cannot make a static reference to the non-static field name
        System.out.println(id + ":" + name);
    }

    public static void main(String[] args) {
        News n = new News();
        // The static method printinfo() from the type News should be accessed in a static way
        n.printinfo();
    }
}
