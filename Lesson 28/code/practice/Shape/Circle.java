package practice.Shape;

// AreaCircle = π * r * r
// PerimeterCircle = 2 * π * r
public class Circle extends Shape {

    public Circle(double a) {
        super(a);
    }

    @Override
    public double calcArea(double a) { // вычисляем площадь круга
        return Math.PI * a * a;
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimeter(double a) { // вычисляем длину окружности
        return 2 * Math.PI * a;
    }
}