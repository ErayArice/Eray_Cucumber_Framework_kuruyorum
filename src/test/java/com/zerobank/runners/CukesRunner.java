package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"json:target/cucumber.jason"},
        features = "src/test/resources/features",
        glue = "com/zerobank/step_defs",
        dryRun = false,
        tags = "@zoom"
)



public class CukesRunner {
}
