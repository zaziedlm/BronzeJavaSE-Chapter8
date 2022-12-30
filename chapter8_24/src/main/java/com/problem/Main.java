package com.problem;

/**
 * Chapter8_24
 * コマンドライン引数は、launch.json へ記載している
 */
public class Main {
    public static void main(char[] args) {
        System.out.println(args[0]);

    }

    public static void main(String[] args) {
        System.out.println(args[1]);
    }
}
