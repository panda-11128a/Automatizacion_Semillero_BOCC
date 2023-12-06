package com.gov.sic.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SuperIntendencia.feature",
        glue = "com.gov.sic.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SicRunner {
}
