/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 1 - Runner
 * Por: Edi Bezerra
 * 
 * */
package cenario1_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario1_steps",
tags="@ct1")

public class Runner_CT1 {

}
