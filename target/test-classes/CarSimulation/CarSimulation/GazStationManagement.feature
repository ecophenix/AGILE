
@tag
Feature: US__0003 Gaz Station Management

 

  @tag1
  Scenario Outline: fill the car
    Given trying to fill a car with a amount of liters 3 in a GazStation having GazLeft 6
    When I start filling the car with 3 liters
    Then I verify the <status> of the filling, it should be true else it should be false

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
  @tag2
  Scenario: Fill the gaz station (set gazleft of the station)
    Given a Gaz Station with certain capacity of fuel 3
    When  setting the Station s capacity to 4 
    Then the capacity of the Gaz Station is updated
    
  @tag3
  Scenario Outline: get the fuel left in gaz station)
    Given a Gaz Station with certain capacity of fuel 1000
    When  getting the Station  capacity  
    Then the capacity of the Gaz Station  is returned
    
    Examples: 
      | name                | GazLeft |
      | Total(GazLeft=10000 | 10000   |
      
  @tag4
  Scenario Outline: fill all the car in the  gaz station
    Given  a Gaz Station with certain capacity of fuel 1000 
    And a queue of cars inside the station
    When  trying to fill all the cars with the same amount of liters 3  
    Then  allCarsShouldBeFilled
    
    Examples: 
      | name                                                | Status |
      | Total(GazLeft=10000,numberOfCars = 3, liters = 30 ) | success|    
      | Total(GazLeft=10,numberOfCars = 3, liters = 30 )    | fail   | 
   
   @tag5
  Scenario: add a car to the queue
    Given a Gaz Station  
    And a car trying to get in with capacity 3 and consumtion 1
    When  fitting the car inside the Gaz Sation
    Then  the number of cars in the queue should be updated
    
   @tag6
  Scenario: remove a car to the queue
    Given a Gaz Station  
    And   a car trying to get in with capacity 3 and consumtion 1
    When  deleting the car from the queue
    Then  the cars in the queue should be updated, if the car doesn't exist it should raise exception NoCarsLeftExceptions  
        
        
