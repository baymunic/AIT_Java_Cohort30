package practice.Shape;

public class Triangle extends Shape {

    public Triangle(double a) {
        super(a);
    }

    @Override
    public double calcArea(double a) {
        return a * a * Math.sqrt(a) / 4.0;
    } // вычисляем площадь треугольника

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter(double a) {
        return a * 3;
    } // вычисляем периметр треугольника
}
