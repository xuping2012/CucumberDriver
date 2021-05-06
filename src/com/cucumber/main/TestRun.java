package com.cucumber.main;

import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

/**
 * 
 * TODO:junit集成cucumber
 * 
 * 
 * 注解@CucumberOptions features指向自然语言脚本的包名，也可以是feature文件的绝对路径
 * glue指向脚本的执行文件包名，也可以是绝对路径 plugin插件html报告输出指定路径，pretty是美化控制台报告
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file TestRun.java
 */
@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/features", glue = { "stepdefinition" }, plugin = {
		"html:cucumber-reports/html", "pretty" })
public class TestRun {

}