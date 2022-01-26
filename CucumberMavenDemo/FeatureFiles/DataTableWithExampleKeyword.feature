@Datadriven @MultipleData
Feature: OrangeHRM navigations testing
Scenario Outline: OrangeHRM application navigate to Adminpage scenario
Given User enter the Orange HRM Login page URL
When member enter cred "<Username>" and "<Password>"
And clicks login
Then navigate to OrangeHRM Adminuser page
And close the browser once Adminuser page is displayed
Examples: 
|Username |Password |
|Admin	  |admin123 |
|Admin	  |admin12 	|
