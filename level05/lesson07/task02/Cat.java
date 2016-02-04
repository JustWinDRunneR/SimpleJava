package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat
{
    private String name = null;
    private String address = null;
    private int age = 3;
    private int weight = 5;
    private String colour;

    public void initialize(String name) {

    }
    public void initialize(String name, int weight, int age) {

    }
    public void initialize(String name, int age) {
        this.weight = weight;
    }
    public void initialize(int weight, String colour) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public void initialize(int weight, String colour, int address) {
    }


}
