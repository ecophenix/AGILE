package CarSimulation.CarSimulation;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;

public class US__0002_Driving_SimulationTest {
	private Car tesla;
	private int distance;
	private int capacity;
	private int consumption;
	private int mileage;
	
	
	@When("^trying to ride for a distance (\\d+)$")
	public void trying_to_ride_for_a_distance(int arg1) throws Exception {
	    tesla = new Car(32,2);
	    capacity = 32;
	    consumption = 2;
	    this.distance = arg1;
	}

	@Then("^the car should be able to move to the destination$")
	public void the_car_should_be_able_to_move_to_the_destination() throws Exception {
	    tesla.rouler(distance);
	}

	@Then("^its capacity should reduce and the recoreded distance kilometrage should be updated$")
	public void its_capacity_should_reduce_and_the_recoreded_distance_kilometrage_should_be_updated() throws Exception {
	    assertEquals(distance,tesla.getKilometrage());
	}

	@When("^trying to ride for a (\\d+)$")
	public void trying_to_ride_for_a(int arg1) throws Exception {
		tesla = new Car(32,2);
		tesla.rouler(arg1);
	}

	@Then("^the car should not be able to move$")
	public void the_car_should_not_be_able_to_move() throws Exception {
		assertNotEquals(distance,tesla.getKilometrage());
	}

	@Then("^both its capacity and the recoreded distance kilometrage should stay the same$")
	public void both_its_capacity_and_the_recoreded_distance_kilometrage_should_stay_the_same() throws Exception {
	   assertEquals(consumption+2,tesla.getConsommation());
	   assertNotNull(tesla.getKilometrage());
	}

}
