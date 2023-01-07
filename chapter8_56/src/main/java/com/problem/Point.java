package com.problem;

/**
 * Chpater8_56
 *
 */
public class Point {
    // 自分の2022年3月11日 第1版第4刷発行は誤植あり 配列括弧が落ちてます
    // public static void main(String args) {
    public static void main(String[] args) {
        int x = 5;
        Point p = new Point();
        p.move(x);

    }

    public void move(int y) {
        // x cannot be resolved to a variable
        System.out.println(x++ + " " + --y);
    }
}
