package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man man1 = new Man();
        Man man2 = new Man();
        man1.name = "Georg";
        man1.age = 25;
        man1.address = "Kiev";
        man2.name = "Maks";
        man2.age = 23;
        man2.address = "Kharkov";

        Woman woman1 = new Woman();
        Woman woman2 = new Woman();
        woman1.name = "Olya";
        woman1.age = 27;
        woman1.address = "Kiev";
        woman2.name = "Alina";
        woman2.age = 26;
        woman2.address = "Kharkov";
        //выведи их на экран тут
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }
    //добавьте тут ваши классы
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(){

        }
        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(){

        }
        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
