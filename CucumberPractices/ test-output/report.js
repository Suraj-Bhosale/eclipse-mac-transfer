$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Product",
  "description": "",
  "id": "amazon-product",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search Product",
  "description": "",
  "id": "amazon-product;search-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am searching product in amazon.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search product \"suraj\" and Price \"bhosale\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display with name \"Mackbook Pro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_am_searching_product_in_amazon()"
});
formatter.result({
  "duration": 3145076555,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "suraj",
      "offset": 18
    },
    {
      "val": "bhosale",
      "offset": 36
    }
  ],
  "location": "Search.i_search_product_and_Price(String,String)"
});
formatter.result({
  "duration": 2335606456,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mackbook Pro",
      "offset": 31
    }
  ],
  "location": "Search.result_will_display_with_name(String)"
});
formatter.result({
  "duration": 156401,
  "status": "passed"
});
formatter.uri("Search.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Product",
  "description": "",
  "id": "amazon-product",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Search Product",
  "description": "",
  "id": "amazon-product;search-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am searching product in amazon.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search product \" \u003cusername\u003e \" and Price \" \u003cpassword\u003e \"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display with name \"Mackbook Pro\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "amazon-product;search-product;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "amazon-product;search-product;;1"
    },
    {
      "cells": [
        "first",
        "sfsff"
      ],
      "line": 10,
      "id": "amazon-product;search-product;;2"
    },
    {
      "cells": [
        "second",
        "fgdfgfgdg"
      ],
      "line": 11,
      "id": "amazon-product;search-product;;3"
    },
    {
      "cells": [
        "third",
        "fgdfgfg"
      ],
      "line": 12,
      "id": "amazon-product;search-product;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 10,
  "name": "Search Product",
  "description": "",
  "id": "amazon-product;search-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am searching product in amazon.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search product \" first \" and Price \" sfsff \"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display with name \"Mackbook Pro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_am_searching_product_in_amazon()"
});
formatter.result({
  "duration": 2283519689,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " first ",
      "offset": 18
    },
    {
      "val": " sfsff ",
      "offset": 38
    }
  ],
  "location": "Search.i_search_product_and_Price(String,String)"
});
formatter.result({
  "duration": 2266056822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mackbook Pro",
      "offset": 31
    }
  ],
  "location": "Search.result_will_display_with_name(String)"
});
formatter.result({
  "duration": 69459,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Search Product",
  "description": "",
  "id": "amazon-product;search-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am searching product in amazon.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search product \" second \" and Price \" fgdfgfgdg \"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display with name \"Mackbook Pro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_am_searching_product_in_amazon()"
});
formatter.result({
  "duration": 2132201062,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " second ",
      "offset": 18
    },
    {
      "val": " fgdfgfgdg ",
      "offset": 39
    }
  ],
  "location": "Search.i_search_product_and_Price(String,String)"
});
formatter.result({
  "duration": 2156933388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mackbook Pro",
      "offset": 31
    }
  ],
  "location": "Search.result_will_display_with_name(String)"
});
formatter.result({
  "duration": 65508,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search Product",
  "description": "",
  "id": "amazon-product;search-product;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I am searching product in amazon.",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I search product \" third \" and Price \" fgdfgfg \"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Result will display with name \"Mackbook Pro\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Search.i_am_searching_product_in_amazon()"
});
formatter.result({
  "duration": 2118853566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " third ",
      "offset": 18
    },
    {
      "val": " fgdfgfg ",
      "offset": 38
    }
  ],
  "location": "Search.i_search_product_and_Price(String,String)"
});
formatter.result({
  "duration": 2636402522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mackbook Pro",
      "offset": 31
    }
  ],
  "location": "Search.result_will_display_with_name(String)"
});
formatter.result({
  "duration": 73871,
  "status": "passed"
});
});