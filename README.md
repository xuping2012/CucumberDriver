### cucumber框架
- 很不错的学习地址：https://www.toolsqa.com/cucumber-automation-framework/
- 介绍详细：
```
从End2End测试用例开始，层层引入，从配置文件读取器开始、实现Singleton单例模式设计;
PageObject页面对象模式设计、WebDriverManager管理器实现Singleton设计等等；
还有支持的数据驱动测试设计、报告显示、还有hooks设计，即环境处理器。
```
- 首先它是支持junit框架
```xml
<dependency>
	<groupId>info.cukes</groupId>
	<artifactId>cucumber-junit</artifactId>
	<version>1.2.5</version>
	<scope>test</scope>
</dependency>
<dependency>
	<groupId>junit</groupId>
	<artifactId>junit</artifactId>
	<version>4.13.1</version>
	<scope>test</scope>
</dependency>
```
- - 用法是创建runner程序入口，使用@RunWith注解：@RunWith(Cucumber.class)
- 它还支持testng框架
```xml
<dependency>
	<groupId>info.cukes</groupId>
	<artifactId>cucumber-testng</artifactId>
	<version>1.2.5</version>
</dependency>

<dependency>
	<groupId>org.testng</groupId>
	<artifactId>testng</artifactId>
	<version>6.11</version>
	<scope>test</scope>
</dependency>
```
- - 用法是必须继承extends AbstractTestNGCucumberTests，其他注解@CucumberOptions通用；
- 它支持extentreport报告，只是还没有找到解决加载样式错误的办法
```xml
<dependency>
	<groupId>com.vimalselvam</groupId>
	<artifactId>cucumber-extentsreport</artifactId>
	<version>3.0.1</version>
</dependency>

<dependency>
	<groupId>com.sitture</groupId>
	<artifactId>cucumber-jvm-extentreport</artifactId>
	<version>3.1.0</version>
</dependency>

<dependency>
	<groupId>com.aventstack</groupId>
	<artifactId>extentreports</artifactId>
	<version>3.0.6</version>
</dependency>

<dependency>
	<groupId>com.relevantcodes</groupId>
	<artifactId>extentreports</artifactId>
	<version>2.40.2</version>
</dependency>
```
### 中文用法
- 众所周知cucumber的feature支持中文描述
- - 即@Given对应@假如，可以去cucumber-java的语言包源码可以查看
```
$ script/cucumber --i18n zh-CN  
      | feature          | "功能"       |  
      | background       | "背景"       |  
      | scenario         | "场景"       |  
      | scenario_outline | "场景大纲"     |  
      | examples         | "例子"       |  
      | given            | "* ", "假如" |  
      | when             | "* ", "当"  |  
      | then             | "* ", "那么" |  
      | and              | "* ", "而且" |  
      | but              | "* ", "但是" |  
      | given (code)     | "假如"       |  
      | when (code)      | "当"        |  
      | then (code)      | "那么"       |  
      | and (code)       | "而且"       |  
      | but (code)       | "但是"       |  
```
- feature支持中文示例：
```
# language: zh-CN  
功能: 测试是否支持中文
场景: 这是一个神奇的feature
假如 让你使用中文写步骤
当 程序支持中文时
那么 输出的就是中文
```
- 是不是很有意思!!!