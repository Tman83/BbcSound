package com.bbcSound.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(


            glue = {"com/BbcSoundProject/stepdefinitions", "com/BbcSoundProject/failedTestHooks"},
            features = "@target/rerun.txt"

    )
    public class FailedTestRunner {

    }
