@tag
Feature: US__0002 Driving Simulation

  @tag1
  Scenario Outline: ride a car with enough capacity
    Given I have a Car with 60 CarCapacity and  CarConsumption 1  
    When trying to ride for a distance 4
    Then the car should be able to move to the destination
    And its capacity should reduce and the recoreded distance kilometrage should be updated
    
    Examples: 
      | name     | distance| status  |
      | Tesla    |     200 | succcess|
      | Mercedes |     100 | succcess|
    

  @tag2
  Scenario Outline: ride a car without the enough capacity
    Given I have a Car with 10 CarCapacity and  CarConsumption 1  
    When trying to ride for a 4
    Then the car should not be able to move 
    And both its capacity and the recoreded distance kilometrage should stay the same
    
    Examples: 
      | name      | distance| status  |
      | Tesla     |     500 | fail    |
      | Mercedes  |     1200| fail    |
