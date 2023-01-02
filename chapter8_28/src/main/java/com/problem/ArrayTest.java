package com.problem;

/**
 * Chapter8_28
 *
 */
public class ArrayTest {
    public static void main(String[] args) {
        char[] chars1 = new char[6];

        chars1[0] = 'b';
        chars1[1] = 'o';
        chars1[2] = 'o';
        chars1[3] = 'k';

        char[] chars2 = {'l','i','b','r','a','r','y'};
        chars1 = chars2;
        
        System.out.println(chars1);
    }
}
