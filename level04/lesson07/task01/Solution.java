package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        isNegative(number);
    }
    public static void isNegative(int number) {
        if (number < 0) {
            if ((number%2) == 0) {
                System.out.println("отрицательное четное число");
            } else if ((number%1) == 0) {
                System.out.println("отрицательное нечетное число");
            }
        } else if (number == 0) {
            System.out.println("нулевое число");
        } else if(number > 0) {
            if ((number % 2) == 0) {
                System.out.println("положительное четное число");
            } else if ((number % 1) == 0) {
                System.out.println("положительное нечетное число");
            }
        }
    }
}
