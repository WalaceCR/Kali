package calculadora;

// CalculadoraTest.java
import org.testng.annotations.Test;
import programacao.calculos.Calculadora;

import static org.junit.Assert.*;

public class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    public void testSoma() {
        assertEquals(5, calculadora.soma(2, 3));
        assertEquals(-1, calculadora.soma(-2, 1));
        assertEquals(0, calculadora.soma(0, 0));
    }

    @Test
    public void testSubtracao() {
        assertEquals(5, calculadora.subtracao(8, 3));
        assertEquals(-3, calculadora.subtracao(-2, 1));
        assertEquals(0, calculadora.subtracao(0, 0));
    }

    @Test
    public void testFatorial() {
        assertEquals(1, calculadora.fatorial(0));
        assertEquals(1, calculadora.fatorial(1));
        assertEquals(120, calculadora.fatorial(5));
        // Teste para exceção com número negativo
        try {
            calculadora.fatorial(-1);
            fail("Deveria ter lançado IllegalArgumentException para número negativo.");
        } catch (IllegalArgumentException e) {
            // Sucesso
        }
    }

    @Test
    public void testFibonacci() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, calculadora.fibonacci(5));
        assertArrayEquals(new int[]{0}, calculadora.fibonacci(1));
        // Teste para exceção com número zero
        try {
            calculadora.fibonacci(0);
            fail("Deveria ter lançado IllegalArgumentException para número zero.");
        } catch (IllegalArgumentException e) {
            // Sucesso
        }
    }

    @Test
    public void testTabuada() {
        assertArrayEquals(new int[]{3, 6, 9, 12}, calculadora.tabuada(3, 4));
        assertArrayEquals(new int[]{5, 10}, calculadora.tabuada(5, 2));
        // Teste para exceção com número ou limite zero
        try {
            calculadora.tabuada(0, 5);
            fail("Deveria ter lançado IllegalArgumentException para número zero.");
        } catch (IllegalArgumentException e) {
            // Sucesso
        }
        try {
            calculadora.tabuada(3, 0);
            fail("Deveria ter lançado IllegalArgumentException para limite zero.");
        } catch (IllegalArgumentException e) {
            // Sucesso
        }
    }
}

