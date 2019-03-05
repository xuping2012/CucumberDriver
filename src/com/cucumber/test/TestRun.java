package com.cucumber.test;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		features = "src/feature",
		glue = {"stepdefinition"}
		)
public class TestRun {

}