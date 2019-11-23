package com.github.dperezcabrera.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/calculadora.feature", plugin = {"pretty", "html:target/cucumber/calculadora"})
@RunWith(Cucumber.class)
public class CalculadoraTest {

}
