package PeopleTests;

import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Stan Smith", 2, 12.50, "LM 0397", 8);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Stan Smith",passenger.getName());
        
    }

    @Test
    public void passengerHasNoOfBags() {
        assertEquals(2, passenger.baggageCount());
    }

    @Test
    public void passengerBagHasWeight() {
        assertEquals(12.50,passenger.baggageWeight(), 0.1);
    }


    @Test
    public void passengerHasFlightNo() {
        assertEquals("LM 0397",passenger.getFlightNo());
    }

    @Test
    public void passengerHasSeatNo() {
        assertEquals("8D",passenger.getSeatNo());
    }

    @Test
    public void calculatePassengerTotalBaggageWeight() {
        assertEquals(25.00,passenger.getTotalBaggageWeight(), 0.1);
    }
}
