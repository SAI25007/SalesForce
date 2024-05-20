
Feature: SalesForce webPage Login
  I want to use this template to login salesforce webpage

  @Login 
  Scenario: Login to SalesForce account
    Given SalesForce page need to displayed
    When User entered the username and password
    Then SalesForce web page is loged in
    
   @CreateAccount
  Scenario: Create a new Salesaccount
  
    Given SalesForce page need to displayed
    When Navigate to sales application
    Then Create new account with name <name> and contact <contact> 
    And Enter name Contact and Mail 
    Then Account is created
    
  Examples:
 |name  |contact    |
 |Sai   |7684287525 |
 |NS    |7864657442 | 
 |akhila|7899433567 |
  
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
