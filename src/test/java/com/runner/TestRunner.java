package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,snippets = SnippetType.CAMELCASE,plugin = {"usage","json:target\\output.json"},features = "src\\test\\resources" , glue ="com.stepdefinition")
public class TestRunner {

	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport("C:\\Users\\mullai\\eclipse-workspace\\Cucumber\\target\\output.json");
	}
}
