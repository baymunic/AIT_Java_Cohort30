package practice.Shape;

public class FigureApp {
    public static void main(String[] args) {

        Shape[] figure = new Shape[4]; // каждый новый класс в Java - это новый тип данных

        figure[0] = (Shape) new Circle(10.0);
        figure[1] = (Shape) new Circle(3.0);
        figure[2] = (Shape) new Triangle(5.0);
        figure[3] = (Shape) new Triangle(10.0);

        // решение "в лоб, перебор руками"
        double s = figure[0].calcArea(figure[0].getA()) + figure[1].calcArea(figure[1].getA()) + figure[2].calcArea(figure[2].getA()) + figure[3].calcArea(figure[3].getA());
        System.out.println("S = " + s);

        double p = figure[0].calcPerimeter(figure[0].getA()) + figure[1].calcPerimeter(figure[1].getA()) + figure[2].calcPerimeter(figure[2].getA()) + figure[3].calcPerimeter(figure[3].getA());
        System.out.println("P = " + p);

        // решение циклом for
        double s1 = 0;
        double p1 = 0;
        for (int i = 0; i < figure.length; i++) {
            s1 = s1 + figure[i].calcArea(figure[i].getA());
            p1 = p1 + figure[i].calcPerimeter(figure[i].getA());
        }
        System.out.println("S calculated by loop = " + s1);
        System.out.println("P calculated by loop = " + p1);

        // решение циклом for each
        double s3 = 0;
        double p3 = 0;
        for ( Shape fig : figure ) {
            s3 += fig.calcArea(fig.getA());
            p3 += fig.calcPerimeter(fig.getA());
        }
        System.out.println("S calculated by loop FOR EACH = " + s3);
        System.out.println("P calculated by loop FOR EACH = " + p3);

        // Рассчитайте общую площадь кругов из задачи 2.
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(3.0);
        double sumS = c1.calcArea(c1.getA()) + c2.calcArea(c2.getA());
        System.out.println("Sum of 2 circles area is: " + sumS);

        // Другой способ
        double s2 = 0;
        for (int i = 0; i < figure.length; i++) {
            if ( figure[i] instanceof Circle) {
                s2 = s2 + figure[i].calcArea(figure[i].getA());
            }
        }
        System.out.println("Sum of 2 circles area is ( other way of calculation ) = " + s2);
    }
}
