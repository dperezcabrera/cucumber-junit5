package com.github.dperezcabrera.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationSteps {

    private Operacion operacion;
    private int resultado;

    @Given("^una operacion$")
    public void una_operacion() throws Throwable {
        operacion = new Operacion();
    }

    @When("^calculamos la suma entre (-?\\d+) y (-?\\d+)$")
    public void calculamos_la_suma_entre_dos_numero(int arg1, int arg2) throws Throwable {
        resultado = operacion.suma(arg1, arg2);
    }

    @Then("^el resultado esperado es (-?\\d+)$")
    public void el_resultado_esperado_es(int resultadoEsperado) throws Throwable {
        assertEquals(resultado, resultadoEsperado);
    }
}
