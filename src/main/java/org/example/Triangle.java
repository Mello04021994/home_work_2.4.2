package org.example;

    class Triangle implements Shape {
        private final double a;
        private final double b;
        private final double c;
        private final String fillColor;
        private final String borderColor;

        public Triangle(double a, double b, double c, String fillColor, String borderColor) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.fillColor = fillColor;
            this.borderColor = borderColor;
        }

        @Override
        public double getArea() {
            double p = getPerimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public double[] getSides() {
            return new double[]{a, b, c}; // Делаем три стороны для треугольника
        }

        @Override
        public String getFillColor() { return fillColor; }

        @Override
        public String getBorderColor() { return borderColor; }
    }

