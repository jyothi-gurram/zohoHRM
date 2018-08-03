
Feature: login functionality
  As a zoho user I should be able to login into application so that I can manage all my tasks
  

  @tag1
  Scenario Outline: verify successful login to the appliation using valid credentials
    Given the user is on the login page
    When he enters <username> and <password>
    And clicks login button
    Then he should be on the homepage 
    And close browser
    
   Examples: 
   
      | username  | password |
      | kundanaharshita@gmail.com|harkun1323| 
   
   
  
