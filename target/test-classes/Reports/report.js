$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/simple.feature");
formatter.feature({
  "name": "To validate fb login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To validate with valid datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To enter into login page",
  "keyword": "Given "
});
formatter.step({
  "name": "to enter user \"\u003cuser\u003e\" and pass \"\u003cpass\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "To validate the currecent url page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "Yugesh",
        "882"
      ]
    },
    {
      "cells": [
        "Guru",
        "928"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate with valid datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To enter into login page",
  "keyword": "Given "
});
formatter.match({
  "location": "step.to_enter_into_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter user \"Yugesh\" and pass \"882\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.to_enter_user_and_pass(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat org.step.step.to_enter_user_and_pass(step.java:52)\n\tat ✽.to enter user \"Yugesh\" and pass \"882\"(file:src/test/resources/Feature/simple.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "To validate the currecent url page",
  "keyword": "Then "
});
formatter.match({
  "location": "step.to_validate_the_currecent_url_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate with valid datas",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To enter into login page",
  "keyword": "Given "
});
formatter.match({
  "location": "step.to_enter_into_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to enter user \"Guru\" and pass \"928\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.to_enter_user_and_pass(String,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat org.step.step.to_enter_user_and_pass(step.java:52)\n\tat ✽.to enter user \"Guru\" and pass \"928\"(file:src/test/resources/Feature/simple.feature:5)\n",
  "status": "failed"
});
formatter.step({
  "name": "To validate the currecent url page",
  "keyword": "Then "
});
formatter.match({
  "location": "step.to_validate_the_currecent_url_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
});