/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 6 - Runner
 * Por: Edi Bezerra
 * 
 * */
package cenario6_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario6_steps",
tags="@ct6")
public class Runner_CT6 {

}
