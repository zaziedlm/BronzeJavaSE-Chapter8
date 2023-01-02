package com.problem;

/**
 * Chapter8_37
 *
 */
public class SwitchMain {
    public static void main(String[] args) {
        char c = 'b';

        switch (c) {
            case 'a':
                System.out.print("A");
                break;
            case 'b':
                System.out.print("B");
            case 'c':
                System.out.print("C");
                break;
            default:
                System.out.print("D");
                break;
        }
    }            
  }