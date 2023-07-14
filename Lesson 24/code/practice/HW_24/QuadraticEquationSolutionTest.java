package practice.HW_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationSolutionTest {
    QuadraticEquationSolution quadraticEquationSolution;

    @BeforeEach
    void setUp() { quadraticEquationSolution = new QuadraticEquationSolution(2.0, -5.0, 6.0);}
    @Test
    public void testRealRoots() {
        QuadraticEquationSolution equation = new QuadraticEquationSolution(1.0, -3.0, 2.0);
        assertFalse(equation.isComplex());
        assertEquals(2.0, equation.getRoot1(), 0.0001);
        assertEquals(1.0, equation.getRoot2(), 0.0001);
    }

    @Test
    public void testComplexRoots() {
        QuadraticEquationSolution equation = new QuadraticEquationSolution(2.0, 4.0, 5.0);
        assertTrue(equation.isComplex());
        assertNull(equation.getRoot1());
        assertNull(equation.getRoot2());
    }

    @Test
    public void testZeroDiscriminant() {
        QuadraticEquationSolution equation = new QuadraticEquationSolution(1.0, -2.0, 1.0);
        assertFalse(equation.isComplex());
        assertEquals(1.0, equation.getRoot1(), 0.0001);
        assertEquals(1.0, equation.getRoot2(), 0.0001);
    }

/*    @Test
    void getDiscriminant() {
    }

    @Test
    void isComplex() {
    }

    @Test
    void getRoot1() {
    }

    @Test
    void getRoot2() {
    }

 */
}
