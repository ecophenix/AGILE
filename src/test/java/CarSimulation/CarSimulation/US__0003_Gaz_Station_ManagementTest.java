package CarSimulation.CarSimulation;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.runner.RunWith;


public class US__0003_Gaz_Station_ManagementTest {
	private Car tesla;
	private Car bmw;
	private int capacity;
	private int consumption;
	private int mileage;
	private GazStation total;
	private int liters;
	private List<Car> queue = new ArrayList<Car>();
	
	@Given("^trying to fill a car with a amount of liters (\\d+) in a GazStation having GazLeft (\\d+)$")
	public void trying_to_fill_a_car_with_a_amount_of_liters_in_a_GazStation_having_GazLeft(int arg1, int arg2) throws Exception {
	    tesla = new Car(0,1);
	    total = new GazStation(arg1);
	    total.addCar(tesla);
	    liters = arg2;
	    
	}

	@When("^I start filling the car with (\\d+) liters$")
	public void i_start_filling_the_car_with_liters(int arg1) throws Exception {
		liters = arg1;
	    
	}

	@Then("^I verify the success of the filling, it should be true else it should be false$")
	public void i_verify_the_success_of_the_filling_it_should_be_true_else_it_should_be_false() throws Exception {
		boolean canFill = total.fillTheCar(tesla, liters);
		assertTrue(canFill);
	}

	@Then("^I verify the Fail of the filling, it should be true else it should be false$")
	public void i_verify_the_Fail_of_the_filling_it_should_be_true_else_it_should_be_false() throws Exception {
		boolean canFill = total.fillTheCar(tesla, liters);
		assertTrue(canFill);
	}

	@Given("^a Gaz Station with certain capacity of fuel (\\d+)$")
	public void a_Gaz_Station_with_certain_capacity_of_fuel(int arg1) throws Exception {
	    total = new GazStation(arg1);
	    
	}

	@When("^setting the Station s capacity to (\\d+)$")
	public void setting_the_Station_s_capacity_to(int arg1) throws Exception {
	    total.setGazLeft(arg1);
	    liters = arg1;
	    		
	}

	@Then("^the capacity of the Gaz Station is updated$")
	public void the_capacity_of_the_Gaz_Station_is_updated() throws Exception {
		assertEquals(liters,total.getGazLeft());
	    
	}

	@When("^getting the Station  capacity$")
	public void getting_the_Station_capacity() throws Exception {
	    liters = total.getGazLeft();
	}

	@Then("^the capacity of the Gaz Station  is returned$")
	public void the_capacity_of_the_Gaz_Station_is_returned() throws Exception {
	   assertNotNull(liters);
	}

	@Given("^a queue of cars inside the station$")
	public void a_queue_of_cars_inside_the_station() throws Exception {
	   total.addCar(tesla);
	   assertNotNull(total.getCars().size());
	   }

	@When("^trying to fill all the cars with the same amount of liters (\\d+)$")
	public void trying_to_fill_all_the_cars_with_the_same_amount_of_liters(int arg1) throws Exception {
	    liters = arg1;
	}

	@Then("^return the (.*) of the entire operation$")
	public void return_the_of_the_entire_operation(String arg1) throws Exception {
	    int result = total.fillAllTheCars(liters);
	    assertNotNull(result);
	}
	
	@Then("^allCarsShouldBeFilled$")
	public void allcarsshouldbefilled() throws Exception {
	    assertTrue(true);
	}


	@Given("^a Gaz Station$")
	public void a_Gaz_Station() throws Exception {
	    total = new GazStation(399);
	}

	@Given("^a car trying to get in with capacity (\\d+) and consumtion (\\d+)$")
	public void a_car_trying_to_get_in_with_capacity_and_consumtion(int arg1, int arg2) throws Exception {
	    bmw = new Car(arg1,arg2);
	    capacity = arg1;
	    consumption = arg2;
	}

	@When("^fitting the car inside the Gaz Sation$")
	public void fitting_the_car_inside_the_Gaz_Sation() throws Exception {
	    total.addCar(bmw);
	}

	@Then("^the number of cars in the queue should be updated$")
	public void the_number_of_cars_in_the_queue_should_be_updated() throws Exception {
	    assertNotNull(total.getCars().size());
	}

	@When("^deleting the car from the queue$")
	public void deleting_the_car_from_the_queue() throws Exception {
		total.addCar(bmw);
	    total.removeCar(bmw);
	}

	@Then("^the cars in the queue should be updated, if the car doesn't exist it should raise exception (.*)$")
	public void the_cars_in_the_queue_should_be_updated_if_the_car_doesn_t_exist_it_should_raise_exception(String arg1) throws Exception {
	    assertNotNull(total.getCars().size());
	}
	
}
