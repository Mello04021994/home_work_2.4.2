package org.example;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(10, "Синий", "Белый"),
                new Rectangle(5, 9, "Зеленый", "Желтый"),
                new Triangle(10, 15, 10, "Розовый", "Чорный")
        };

        for (Shape shape : shapes) {
            shape.printCharacteristics();
        }
    }
}