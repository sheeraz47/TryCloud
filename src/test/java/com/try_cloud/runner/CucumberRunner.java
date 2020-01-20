package com.try_cloud.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\IdeaProjects\\TryCloud\\src\\test\\resources", // path to features
        glue = "C:\\Users\\Admin\\IdeaProjects\\TryCloud\\src\\test\\java\\com\\try_cloud\\step_definitions", //path to step definitions
        dryRun = true,
        tags = "@Login"

)
public class CucumberRunner {


}