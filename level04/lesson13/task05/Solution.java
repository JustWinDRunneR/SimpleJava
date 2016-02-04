package com.javarush.test.level04.lesson13.task05;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        for(int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }*/
        String str1 = "Hi";
        String str2 = "Hi";
        String str11 = "Hello";
        String str22 = new String("Hi");
        String str3 = "Hi";
        String str4 = "H43543i";
        System.out.println(str1 == str2);
        System.out.println(str1 == str22);
        System.out.println(str1 == str11);
        System.out.println(str3.equals(str4));

    }
}
