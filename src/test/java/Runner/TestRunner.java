package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD2\\src\\test\\java\\Features"

        // features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD2\\src\\test\\java\\Features\\Signout.feature"
       // features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD2\\src\\test\\java\\Features\\Registration.feature"
        //features = "C:\\Users\\fazlu\\IdeaProjects\\CucumberBDD2\\src\\test\\java\\Features\\Login.feature"
        ,glue={"Steps"}
        ,monochrome = false
      //  tags = "@Reg"


public class TestRunner {
}