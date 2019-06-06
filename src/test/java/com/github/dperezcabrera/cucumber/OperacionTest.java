package com.github.dperezcabrera.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/features/operacion.feature", plugin = {"pretty", "html:target/cucumber/operacion"})
@RunWith(Cucumber.class)
public class OperacionTest {

}
