package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму.
Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int summ = 0;
        do {
            int a = Integer.parseInt(reader.readLine());
            if (a == -1) {
                --summ;
                break;
            }
            summ = a + summ;
            System.out.print("Summ = " + summ + " ");
        } while (true);
        System.out.println(summ);
    }
}
