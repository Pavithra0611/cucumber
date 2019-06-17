
Feature: Login testmeapp application
  I want to login to testmeapp

   Scenario: Admin Login
   Given I want to enter "Admin" as username
   And I want to enter "password456" as password
   Then click on login
   And i want to enter category name
    And i want to enter subcategory name
    And enter <product_name> 
    | product_name  | 
    | BasketBall    |     
    | VolleyBall    |   
    And enter price as "$300"
    And enter quantity as "10"
    And enter brand as "sports"
    And enter description as "Sport Equipments"
 
 

  
