package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"

        },
        features ="src/test/resources/features",
        glue = "com/cydeo/stepDefinitions",
        dryRun=false,
        tags="@NEXTBASE-1458",
        publish=false
)
public class CukesRunner {


}
