$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OpenGoogle.feature");
formatter.feature({
  "line": 2,
  "name": "Google search page testing",
  "description": "",
  "id": "google-search-page-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hooks"
    }
  ]
});
formatter.before({
  "duration": 700878,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Searching the input in google search engine",
  "description": "",
  "id": "google-search-page-testing;searching-the-input-in-google-search-engine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TaggedHook"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is entering Google.co.in",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enter the search term \"Jordan Time Zone\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click the enter key",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user should see the search results",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenGoogleDefinition.user_is_entering_Google_co_in()"
});
formatter.result({
  "duration": 6329885961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jordan Time Zone",
      "offset": 28
    }
  ],
  "location": "OpenGoogleDefinition.user_enter_the_search_term(String)"
});
formatter.result({
  "duration": 221999524,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDefinition.click_the_enter_key()"
});
formatter.result({
  "duration": 1909824948,
  "status": "passed"
});
formatter.match({
  "location": "OpenGoogleDefinition.the_user_should_see_the_search_results()"
});
formatter.result({
  "duration": 7267113563,
  "status": "passed"
});
formatter.after({
  "duration": 172333,
  "status": "passed"
});
});