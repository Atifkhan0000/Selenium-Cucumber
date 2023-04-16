Feature: Login

              
  Scenario: Successful login wit valid credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/Login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then page title should be "Your store. Login"
    And close browser 
    
  
   
