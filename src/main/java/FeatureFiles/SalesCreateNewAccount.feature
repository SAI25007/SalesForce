
Feature: To Create new account in Sales
  
  @SalesCreateNewAccount
  Scenario: Create new account in sales
  
    Given Login to the SalesForce account
    When Create new account
    And Enter all the User Details
    Then Account is created
    
  Examples:
   |Name  | Contact  | Mail |
   |      |          |      |

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
