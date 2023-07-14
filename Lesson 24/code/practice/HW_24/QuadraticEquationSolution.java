package practice.HW_24;
import java.lang.Math;

public class QuadraticEquationSolution {

    // поля класса
        private Double a;
        private Double b;
        private Double c;
        private Double discriminant;
        private Boolean isComplex;

        // конструктор
        public QuadraticEquationSolution(Double a, Double b, Double c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.discriminant = calculateDiscriminant();
            this.isComplex = this.discriminant < 0;
        }

        // методы
        private Double calculateDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }


        public Boolean isComplex() {
            return isComplex;
        }

        public Double getRoot1() {
            if (isComplex) {
                return null;
            } else {
                return (-b + Math.sqrt(discriminant)) / (2 * a);
            }
        }

        public Double getRoot2() {
            if (isComplex) {
                return null;
            } else {
                return (-b - Math.sqrt(discriminant)) / (2 * a);
            }
        }
    }
/*
В данном примере класс QuadraticEquationSolution содержит приватные поля a, b и c,
которые представляют коэффициенты квадратного уравнения.
Поля discriminant и isComplex вычисляются в конструкторе и используются
для хранения дискриминанта и информации о том, является ли решение комплексным.

Класс также предоставляет публичные методы для получения значений полей
и вычисления корней уравнения (getRoot1() и getRoot2()).
Если решение является комплексным, методы возвращают значение null.

Вы можете использовать этот класс для создания экземпляров
и работы с решениями квадратных уравнений в вашей программе.
 */