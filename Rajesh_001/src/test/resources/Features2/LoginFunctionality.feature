Feature: Automating Login Functionality in oragr HRM
  
  Scenario: Validating login functionality- Test case must fail
   
   Given User Launches Chrome Browser
   And User Enters URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
   Then User Enters Username as "Admin"
   Then User Enters Password as "admin1234"
   And Clicks on Login Button
   But Sys through Invalid Credentials
   Then Close the browser 
