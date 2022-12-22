package com.problem;

/**
 * Chapter8_60
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");

        if(s1 == s2) {
            System.out.print("s1 == s2 ");
        } else {
            System.out.print("s1 != s2 ");
        }

        if(s1 == s3) {
            System.out.print("s1 == S3");
        } else {
            System.out.print("s1 != s3");
        }

        System.out.println("\n******************");
        // おまけ
        if(s1.equals(s2) ) {
            System.out.print("s1 equal s2. ");
        } else {
            System.out.print("s1 NOT equal s2. ");
        }

        if(s1.equals(s3)) {
            System.out.print("s1 equal S3.");
        } else {
            System.out.print("s1 NOT equal s3.");
        }

    }
}
