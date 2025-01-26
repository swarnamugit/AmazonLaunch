
Feature: Amazon Login Automation
  Scenario: Check if Login page is successful with valid credentials
  
    Given User launch Amazon website
    And user click on sign in option

    When User gives correct Email id
    And Clicks on Continue
    And User gives password
    Then user clicks on Sigin option
   

  