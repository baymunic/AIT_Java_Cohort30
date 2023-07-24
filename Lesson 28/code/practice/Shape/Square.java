package practice.Shape;

// s - length of side
public class Square extends Shape{

    public Square(double a) {
        super(a);
    }

    @Override
    public double calcArea(double a) {
        return 0;
    }

    @Override
    public double calcArea() { // вычисляем площадь квадрата
        return a * a;
    }

    @Override
    public double calcPerimeter(double a) { // вычисляем длину периметра
        return 4 * a;
    }

}
