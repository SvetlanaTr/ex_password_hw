package com.company;

import java.io.IOException;

public class Main {

    //*
    // четное не четное число
    // */
    public static void main(String[] args) throws IOException {
        // write your code here
        int chislo = System.in.read();

        if ((chislo % 2) == 0) {
            System.out.println("Число " + chislo + " четное ");
        } else {
            if ((chislo % 1) == 0) {
                System.out.println("Число " + chislo + " нечетное ");
            }


            System.out.println();
        }
    }
}