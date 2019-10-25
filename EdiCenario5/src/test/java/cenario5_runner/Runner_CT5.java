/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 5 - Runner
 * Por: Edi Bezerra
 * 
 * */
package cenario5_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario5_steps",
tags="@ct5")

public class Runner_CT5 {

}
