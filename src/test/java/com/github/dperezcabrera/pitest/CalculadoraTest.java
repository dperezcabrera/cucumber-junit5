package com.github.dperezcabrera.pitest;

import com.github.dperezcabrera.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        // given
        Calculadora calculadora = new Calculadora();
        int expectedResult = 0;
        int value0 = 0;
        int value1 = 0;

        // when
        int result = calculadora.suma(value0, value1);

        // then
        assertEquals(expectedResult, result);
    }

    @Test
    public void testDiv() {
        // given
        Calculadora calculadora = new Calculadora();
        double value0 = 0;
        double value1 = 0;

        // when
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> calculadora.div(value0, value1));

        // then
        assertEquals("/ by zero", e.getMessage());
    }
}
