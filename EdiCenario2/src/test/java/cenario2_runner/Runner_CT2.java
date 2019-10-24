/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 2 - Runner
 * Por: Edi Bezerra
 * 
 * */
package cenario2_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario2_steps",
tags="@ct2")

public class Runner_CT2 {

}