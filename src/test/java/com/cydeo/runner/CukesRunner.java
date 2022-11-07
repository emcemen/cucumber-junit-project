package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "pretty",
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features ="src/test/resources/features",
        glue = "com/cydeo/step_definitions" ,
        dryRun =false,
        tags ="@smoke", // for parallel test we need to leave it like "" empty..
        publish = false // this helps you directly go to report gives you link
        //mvn test -Dcucumber.filter.tags=@smoke



)

public class CukesRunner {

    // glue part is coming from step_definitions package right click on it and then copy/path/reference after that
    // path from source root because that class is at the same level with CukesRunner class.

    //features part is coming from login.features package right click on it and then copy/path/reference after that
    //path from Content root because that class is not same level with CukesRunner class.

    //tags = "@librarian or @student" if I change it to and that is like java that means both of them at the same
    // time are in the features  like @student and @ librarian if not sorry :)

    //dryRun true, only for checking its skipping step definitions going login feature and giving us the missing
    // snippet if there is one---if I want to control unimplemented snippet I use that tool false is turn of the tool
    // and its run as before
}
