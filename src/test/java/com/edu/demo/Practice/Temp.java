package com.edu.demo.Practice;

public class Temp {

    public static void main(String[] args) {

        /*char c_;
        int i = 0;
        int j = 'z'-'a';

        while (i <= j) {
            c_ = (char) ('a' + i);
            System.out.print(c_);
            i++;
        }

        System.out.println();
        for (char k = 'a'; k <= 'z'; k++) {
            System.out.print(k);
        }*/

        printDigits(97);
    }

    static void printDigits(int i) {

        if (i <= 122) {
            System.out.println((char) i + " ");
            printDigits(i + 1);
        }
    }
}
