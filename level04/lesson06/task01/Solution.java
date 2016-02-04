package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if(a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
       /* min(a,b);

    }
        public static void min(int a, int b) {
            if(a < b) {
                System.out.println("minimum is a = " + a);
            } else {
                System.out.println("min is b = " + b);
            }
        }*/