package com.cucumber.managers;

import com.cucumber.dataProviders.ConfigFileReader;

/**
 * 
 * TODO:文件作为Singleton FileReaderManager类维护对其自身实例的静态引用，并从静态getInstance（）方法返回该引用。
 * FileReaderManager实现私有构造函数，因此客户端无法实例化FileReaderManager实例。
 * getConfigReader（）方法返回ConfigFileReader的实例
 * ，但是此方法不是静态的。因此，客户端必须使用getInstance（）方法来访问FileReaderManager的其他公共方法，例如
 * FileReaderManager.getInstance（）。getConfigReader（）
 * 
 * @author Joe-Tester
 * @time 2021年5月6日
 * @file FileReaderManager.java
 */
public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader()
				: configFileReader;
	}
}