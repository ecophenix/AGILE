package CarSimulation.CarSimulation;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;


public class US__0001_Car_CustomizationTest {
	private Car tesla;
	private int capacity;
	private int consumption;
	private int mileage;
	

	@Given("^I have a Car with (\\d+) CarCapacity and  CarConsumption (\\d+)$")
	public void i_have_a_Car_with_CarCapacity_and_CarConsumption(int arg1, int arg2) throws Exception {
	    this.tesla = new Car(arg1,arg2);
	    
	}

	@When("^I check for the capacity$")
	public void i_check_for_the_capacity() throws Exception {
	    this.capacity = this.tesla.getCapacite();
	}

	@Then("^I get the capacity of the car$")
	public void i_get_the_capacity_of_the_car() throws Exception {
	   assertNotNull(capacity);
	}

	@When("^I check for the car consumption$")
	public void i_check_for_the_car_consumption() throws Exception {
	    consumption = tesla.getConsommation();
	}

	@Then("^I get the consumption of the car$")
	public void i_get_the_consumption_of_the_car() throws Exception {
		assertNotNull(consumption);
	}

	@When("^I check for the car mileage$")
	public void i_check_for_the_car_mileage() throws Exception {
	    mileage = tesla.getKilometrage();
	}

	@Then("^I get the mileage of the car$")
	public void i_get_the_mileage_of_the_car() throws Exception {
		assertNotNull(mileage);
	}

}
