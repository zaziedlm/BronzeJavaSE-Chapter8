package com.problem;

/**
 * Chapter8_27
 *
 */
public class Airline {
    String fligntNumber;

    public void printFligntNumber(){
        System.out.println(fligntNumber);
    }
    public static void main(String[] args) {
        Airline a1 = new Airline();
        Airline a2 = a1;

        a1.fligntNumber = "DAL027";
        a2.fligntNumber = "DAL305";

        a1.printFligntNumber();
        a2.printFligntNumber();

    }
}
