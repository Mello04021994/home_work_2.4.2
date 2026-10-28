package org.example;

    class Circle implements Shape {
        private final double radius;
        private final String fillColor;
        private final String borderColor;

        public Circle(double radius, String fillColor, String borderColor) {
            this.radius = radius;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double[] getSides() {
            return new double[0];
        }

        @Override
        public double getPerimeter() { // Переопределяем метод круга
            return 2 * Math.PI * radius;
        }

        @Override
        public String getFillColor() { return fillColor; }

        @Override
        public String getBorderColor() { return borderColor; }
    }

