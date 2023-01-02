package com.problem;

/**
 * Chapter8_30
 *
 */
public class Item {
    public static void main(String[] args) {
        Item[] items = {new Item(), new Item(), new Item()};

        int u = items.length;

        // Syntax error, insert "while ( Expression ) ;" to complete DoStatement
        do  while (u > 0){
            System.out.println(u-- + " ");
        };
        System.out.println("Hello World!");
    }
}
