package com.cucumber.contexts;

import java.util.HashMap;
import java.util.Map;

import com.cucumber.enums.Context;


/**
 * 
 * TODO:测试上下文数据共享
 *
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file ScenarioContext.java
 */
public class ScenarioContext {

	private Map<String, Object> scenarioContext;

	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}

	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}

	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}

	public Boolean isContains(Context key) {
		return scenarioContext.containsKey(key.toString());
	}

}