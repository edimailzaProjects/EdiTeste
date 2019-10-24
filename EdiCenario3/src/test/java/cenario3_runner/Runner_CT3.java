/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 3 - Runner
 * Por: Edi Bezerra
 * 
 * */
package cenario3_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario3_steps",
tags="@ct3")

public class Runner_CT3 {

}