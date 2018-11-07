@tag
Feature: US__0001 Car Customization

  
  
    
  
  @tag1
  Scenario Outline: Get Car Capacity
    Given I have a Car with 60 CarCapacity and  CarConsumption 1
    When I check for the capacity 
    Then I get the capacity of the car 

    Examples: 
      | name                | capacity |
      | bmw(capacity=5)     |     5    |
      | Tesla(capacity=7)   |     7    |
      
  @tag2
  Scenario Outline: Get Car Consomation
    Given I have a Car with 60 CarCapacity and  CarConsumption 1
    When I check for the car consumption 
    Then I get the consumption of the car

    Examples: 
      | name                 | consumption|
      | bmw(consumption=5)   |       5    |
      | Tesla(consumption=7) |       7    | 
      
   @tag3
  Scenario Outline: Get Car Kilometrage
    Given I have a Car with 60 CarCapacity and  CarConsumption 1
    When I check for the car mileage
    Then I get the mileage of the car

    Examples: 
      | name                      | Kilometrage |
      | bmw(consumption=10000)    |     10000   |
      | Tesla(consumption=20000)  |     20000   |    
