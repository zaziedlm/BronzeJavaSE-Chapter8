package com.problem;

/**
 * Cgapter8_47
 *
 */
public class Calculator {
    int beforeTaxes(int price){
        return (int)(price * 1.08);
    }
    double beforeTaxes(int price){
        return price * 1.08;
    }
    public static void main(String[] args) {
        int p = 40;
        Calculator calc = new Calculator();
        System.out.println("payment = " + calc.beforeTaxes(p));
    }
}
