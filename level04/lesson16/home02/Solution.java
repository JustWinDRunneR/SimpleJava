package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        srednee(a,b,c);
    }
    public static void srednee(int a, int b, int c) {
        if (a > b && a > c && c > b) {
            System.out.println(c);
        } else if (b > a && b > c && a > c) {
            System.out.println(a);
        } else if (c > a && c > b && b > a) {
            System.out.println(b);
        }
        /*110 50 100 = 100;
        100 110 50 = 100;
        50 100 110 = 100;*/

    }
}
