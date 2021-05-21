package PeopleTests;

import People.Passenger;
import org.junit.Before;
import org.junit.Test;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Stan Smith", 2, 18.00, "LM 0397", "8D");
    }

    @Test
    public void passengerHasName() {
        
    }

    @Test
    public void passengerHasNoOfBags() {
    }

    @Test
    public void passengerBagsHaveWeight() {
    }


    @Test
    public void passengerHasFlightNo() {
    }

    @Test
    public void passengerHasSeatNo() {
    }
}
