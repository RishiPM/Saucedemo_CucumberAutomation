$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("soucedemo_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Saucedemo Login Page",
  "description": "Description: Automationg the login page using Cucumber",
  "id": "saucedemo-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login page automation in Saucedemo",
  "description": "",
  "id": "saucedemo-login-page;login-page-automation-in-saucedemo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter URL \"https://www.saucedemo.com/\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Login Success",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefinition.open_browser()"
});
formatter.result({
  "duration": 7157562100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 11
    }
  ],
  "location": "Login_StepDefinition.enter_URL(String)"
});
formatter.result({
  "duration": 2171528200,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.enter_Username()"
});
formatter.result({
  "duration": 270107000,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.enter_Password()"
});
formatter.result({
  "duration": 224780600,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.click_on_Login()"
});
formatter.result({
  "duration": 4310304200,
  "status": "passed"
});
formatter.match({
  "location": "Login_StepDefinition.login_Success()"
});
formatter.result({
  "duration": 2802640500,
  "status": "passed"
});
});