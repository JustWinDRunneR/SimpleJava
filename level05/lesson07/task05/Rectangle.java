package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    private int top = 5;
    private int left = 3;
    private int width = 0;
    private int height = 0;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public void initialize(int left, int top) {

    }
    public void initialize(int left, int top, int width) {

    }
    public void initialize(Rectangle rect) {
        rect = this;
        /*this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.height;*/

    }
}
