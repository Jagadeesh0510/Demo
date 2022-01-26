@Datadriven
Feature: OrangeHRM Login operation
Scenario: OrangeHRM Login to Homepage scenario
Given User entering the OrangeHRM Login page
When member enter username and password
|Admin |admin123 |
And click the enter
Then OrangeHRM Homepage should be displayed