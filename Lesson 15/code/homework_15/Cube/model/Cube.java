package homework_15.Cube.model;

public class Cube {
    // Задача 1. Создать класс Cube, описывающий куб cо стороной a.
    // Реализовать в нем методы определения периметра p, площади s и объема v.
    // Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
    // Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.

    public double a;  // сторона куба

    // определяем методы
    // метод для вычисления периметра куба
    // Конструктор класса Cube

    public Cube(double a) { this.a = a; }

    public void setA(double a) { this.a = a; }

    // метод для вычисления периметра

    public double perimetr (double a) {
        return 12 * a;
    }
    // метод для вычисления площади
    public double square (double a) {
        return 6 * (a * a);
    }
    // метод для вычисления объёма
    public double volume (double a) {
        return a * a * a;
    }
}
