$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/mindoula/features/careExtenders.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Care Extender Creation",
  "description": "",
  "id": "verify-care-extender-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9516850005,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to the application",
  "description": "",
  "id": "verify-care-extender-creation;login-to-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigates to Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters login credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.user_navigates_to_Login_Page()"
});
formatter.result({
  "duration": 2852811710,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_login_credentials()"
});
formatter.result({
  "duration": 3300150464,
  "status": "passed"
});
formatter.after({
  "duration": 97671,
  "status": "passed"
});
formatter.after({
  "duration": 23646,
  "status": "passed"
});
formatter.before({
  "duration": 291470,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Create Care Extender Details",
  "description": "",
  "id": "verify-care-extender-creation;create-care-extender-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@VerifyCareExtender"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user clicks on Mega Menu",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on careExtenders",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Verify data on CareExtenders",
  "rows": [
    {
      "cells": [
        "email",
        "name",
        "phone",
        "roles",
        "active"
      ],
      "line": 22
    },
    {
      "cells": [
        "mary.kom@bd.com",
        "Mary Kom",
        "(673) 984-3939",
        "Program Manager,Case Manager",
        "Yes"
      ],
      "line": 23
    },
    {
      "cells": [
        "narsi@mindoula.com",
        "Care Extender_1",
        "(768) 788-8888",
        "Administrator,Program Manager",
        "Yes"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CareExtendersSteps.user_clicks_on_Mega_Menu()"
});
formatter.result({
  "duration": 7159535417,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cmat-icon _ngcontent-c1\u003d\"\" class\u003d\"mat-icon material-icons\" role\u003d\"img\" aria-hidden\u003d\"true\"\u003e...\u003c/mat-icon\u003e is not clickable at point (36, 33). Other element would receive the click: \u003cdiv _ngcontent-c18\u003d\"\" class\u003d\"mind-loader page ng-star-inserted\" id\u003d\"loader_icon_section\" ng-reflect-klass\u003d\"mind-loader\" ng-reflect-ng-class\u003d\"page\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d68.0.3440.106)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-AG24SAE\u0027, ip: \u0027172.20.10.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:56945}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e), userDataDir\u003dC:\\Users\\rajesh\\AppData\\Local\\Temp\\scoped_dir24920_1072}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003d, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d68.0.3440.106, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 40f057be95f4da7455932fc248b7bf79\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:275)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:82)\r\n\tat com.mindoula.pages.Header.openMegaMenu(Header.java:23)\r\n\tat com.mindoula.stepdefinitions.CareExtendersSteps.user_clicks_on_Mega_Menu(CareExtendersSteps.java:29)\r\n\tat ✽.Then user clicks on Mega Menu(src/main/java/com/mindoula/features/careExtenders.feature:19)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CareExtendersSteps.user_clicks_on_careExtenders()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CareExtendersSteps.verify_data_on_CareExtenders(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 85847,
  "status": "passed"
});
formatter.after({
  "duration": 26731,
  "status": "passed"
});
});