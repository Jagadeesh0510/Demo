@Datadriven
Feature: OrangeHRM navigation operation
Scenario: OrangeHRM Login and navigate to Adminpage scenario
Given User enter the OrangeHRM Login page URL
When member enter creds username and password
|Username |Password |
|Admin |admin123 |
And click the enter to login
Then navigate to OrangeHRM Adminpage 
And close the browser once Admin page is displayed