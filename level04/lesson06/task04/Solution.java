package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int a = name1.length();
        int b = name2.length();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (a == b) {
                System.out.println("Длины имен равны");
        }
    }
}
