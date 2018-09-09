$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/mindoula/features/careExtenders.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Care Extender Creation",
  "description": "",
  "id": "verify-care-extender-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8223940542,
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
  "duration": 2783316909,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.user_enters_login_credentials()"
});
formatter.result({
  "duration": 3398634974,
  "status": "passed"
});
formatter.after({
  "duration": 95101,
  "status": "passed"
});
formatter.after({
  "duration": 20048,
  "status": "passed"
});
formatter.before({
  "duration": 300723,
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
  "duration": 6791219501,
  "status": "passed"
});
formatter.match({
  "location": "CareExtendersSteps.user_clicks_on_careExtenders()"
});
formatter.result({
  "duration": 22184148447,
  "status": "passed"
});
formatter.match({
  "location": "CareExtendersSteps.verify_data_on_CareExtenders(DataTable)"
});
formatter.result({
  "duration": 100534225119,
  "status": "passed"
});
formatter.after({
  "duration": 305350,
  "status": "passed"
});
formatter.after({
  "duration": 78651,
  "status": "passed"
});
});