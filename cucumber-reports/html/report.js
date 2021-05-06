$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logintest.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "Description: This feature will test Login functionality",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with valid credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters UserName and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "He can visit mail home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Account name is displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click loginout link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Account loginout appliction",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Close curret borwer",
  "keyword": "Then "
});
formatter.match({
  "location": "testdfs.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 18111930800,
  "status": "passed"
});
formatter.match({
  "location": "testdfs.user_enters_UserName_and_Password()"
});
formatter.result({
  "duration": 248376200,
  "status": "passed"
});
formatter.match({
  "location": "testdfs.click_Login_button()"
});
formatter.result({
  "duration": 87633200,
  "status": "passed"
});
formatter.match({
  "location": "testdfs.he_can_visit_mail_home_page()"
});
formatter.result({
  "duration": 10046286800,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#useraddr\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027DESKTOP-TJK6KB0\u0027, ip: \u0027192.168.2.103\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\qguan\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:39985}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a7a22d1f08542db86f76a0d0ddbb3ed6\n*** Element info: {Using\u003did, value\u003duseraddr}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:368)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepdefinition.testdfs.he_can_visit_mail_home_page(testdfs.java:52)\r\n\tat ✽.Then He can visit mail home page(logintest.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "testdfs.account_name_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testdfs.click_loginout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testdfs.account_loginout_success()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "testdfs.close_borwer()"
});
formatter.result({
  "status": "skipped"
});
});