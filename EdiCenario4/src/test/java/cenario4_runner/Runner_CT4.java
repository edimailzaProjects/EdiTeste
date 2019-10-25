/*
 * PROJETO EDI TESTER
 * Cenários de Testes:
 * 4 - Runner
 * Por: Edi Bezerra
 * 
 * */

package cenario4_runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue="cenario4_steps",
tags="@ct4")

public class Runner_CT4 {

}
