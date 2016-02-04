package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     /*   int m = Integer.parseInt(reader.readLine());
          int n = Integer.parseInt(reader.readLine());*/

        for(int i = 0; i <= 10; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println(" ");
        }
    }
}
