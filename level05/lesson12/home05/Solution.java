package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
 Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int summ = 0;
        do {
            String word = reader.readLine();
            if(word.equals("сумма")){
                break;
            }
            int number = Integer.parseInt(word);
            summ += number;
            //System.out.println("summa = " + summ);
        }
        while (true);
        System.out.println(summ);
    }
}
