package com.github.dperezcabrera.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSteps {

    private Calculadora calculadora;
    private int resultado;

    @Given("^una calculadora")
    public void una_calculadora() throws Throwable {
        calculadora = new Calculadora();
    }

    @When("^realizamos la suma entre (-?\\d+) y (-?\\d+)$")
    public void realizamos_la_suma_entre_dos_numero(int arg1, int arg2) throws Throwable {
        resultado = calculadora.suma(arg1, arg2);
    }

    @Then("^el resultado esperado es (-?\\d+)$")
    public void el_resultado_esperado_es(int resultadoEsperado) throws Throwable {
        assertEquals(resultado, resultadoEsperado);
    }
}
