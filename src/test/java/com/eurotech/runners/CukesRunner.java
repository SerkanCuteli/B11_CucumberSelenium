package com.eurotech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/eurotech/stepDefinitions",
        dryRun = false,
        tags = "@navigationMenu"

)
public class CukesRunner {
}
