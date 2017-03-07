package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    //*
    // четное не четное число
    // */
    public static void main(String[] args) throws IOException {
        // write your code here
        //1. приветствие
  /*      Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("hello " + name );
*/
//2 в обратном порядке
/*
        for (int i= args.length-1; i>=0; i--)
        {

            System.out.println(args[i] );
        }*/

//3 с переходом и без перехода на новую строку
        /*Random urov= new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите сколько случайных чисел: ");
        int ColNumb = scanner.nextInt();
        for (int x=0 ; x< ColNumb;x++){
            int z = urov.nextInt(10);
            System.out.println(z);
            System.out.print(z+" ");
        }*/

//4  пароль и образец
        /*String pr="123456";
        Scanner scanner = new Scanner(System.in);
        String pas = scanner.next();
        if (pr.equals(pas)) {
        System.out.println("пароли одинаковые");
        }
        else System.out.println("не правильный пароль");
*/
// 5 сумма и произведение
        { Scanner scanner = new Scanner(System.in);

             int z;
            System.out.println("введите число 1:");
            int s = scanner.nextInt();
            System.out.println("введите число 2:");
            int p = scanner.nextInt();
            System.out.println("Sum = " + (s+p));
            System.out.println("Proizv = "+ (s*p));
        }

 //6.1 четное не четное число
       /*
        int chislo = System.in.read();

        if ((chislo % 2) == 0) {
            System.out.println("Число " + chislo + " четное ");
        } else {
            if ((chislo % 1) == 0) {
                System.out.println("Число " + chislo + " нечетное ");
            }
            System.out.println();
        }

        */

       //



    }
}