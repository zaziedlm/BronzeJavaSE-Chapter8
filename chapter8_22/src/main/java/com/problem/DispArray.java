package com.problem;

/**
 * Chapter8_22
 *
 */
public class DispArray {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        // A.
        for(int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("****************************");

        // B.   //Syntax error
        // while (int i2 = 0; i2 < array.length) {
        //     System.out.println(array[i]);
        // }

        // C.
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // D.   //Syntax error
        // while (int i3 = 1; i < array.length) {
        //     System.out.println(array[i]);        
        // }
    
    }
}
