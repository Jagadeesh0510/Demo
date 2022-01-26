@Hooks
Feature: Google search page testing

@TaggedHook
Scenario: Searching the input in google search engine
	Given user is entering Google.co.in  
	When user enter the search term "Jordan Time Zone"
	And click the enter key
	Then the user should see the search results