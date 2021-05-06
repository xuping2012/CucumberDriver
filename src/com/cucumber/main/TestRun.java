package com.cucumber.main;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/features",
		glue = {"stepdefinition"}
		)
public class TestRun {

}