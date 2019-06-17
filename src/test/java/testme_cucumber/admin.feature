
Feature: TestMe app
  

  @smoke
   Scenario: Admin Login
   Given I want to enter "Admin" as username
   And I want to enter "password456" as password
   Then click on login and Add Product button

  @smoke 
   Scenario: Add Category
   Then  i enter product details
   And click on Add Product button
   And click on signout
   
   @smoke
   Scenario: User login and add products
   Given I want to enter "Lalitha" as username for login
   Then i enter "password123" as password
   And click on login button
   Given i want to enter the product name and click add to cart
   Then enter username and password for payment
   Then click on continue and signout by user
  
  @smoke
  Scenario: Admin adding products
  Given enter admin details to login
  Then click on Add product button
  Given Admin enters "Electronics" as Category name
  Then i enter "Headphone" as Sub category name
  Then i enter "jabra11" as product name
  Then i enter "$300" as price
  Then i enter "10" as quantity
  Then i enter "jabra" as brand
  Then i enter "Head phone suitable for office" as description
  Then click on add
  
   