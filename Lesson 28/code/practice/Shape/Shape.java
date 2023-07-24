package practice.Shape;

public abstract class Shape {
    double a; // длина какого-то ребра для фигуры, для окружности - радиус, для квадрата - сторона,
    // для треугольника - сторона

    // конструктор
    public Shape(double a) {
        this.a = this.a;
    }

    // геттер
    public double getA() {return a;}

    // сеттер
    public void setA(double a) {this.a = a;}

    public abstract double calcArea(double a); // тело метода отсутствует!

//    public abstract double calcArea(); // вычисляем площадь круга

    public abstract double calcArea();

    public abstract double calcPerimeter(double a); // тело метода отсутствует!

//    public abstract double calcPerimeter(); // вычисляем длину окружности

}
