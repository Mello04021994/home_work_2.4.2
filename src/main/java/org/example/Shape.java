package org.example;

import java.util.Arrays;

public interface Shape {
    double getArea();

    String getFillColor();
    String getBorderColor();

    double[] getSides();

    default double getPerimeter() {
        return Arrays.stream(getSides()).sum(); // Метод расчета периметра
    }

    default void printCharacteristics() {
        System.out.printf("%s периметр %.2f площадь %.2f заливка фона - %s заливка границ - %s%n",
                this.getClass().getSimpleName(),
                getPerimeter(),
                getArea(),
                getFillColor(),
                getBorderColor()
        ); // Делаем удобный формат для вывода
    }
}
