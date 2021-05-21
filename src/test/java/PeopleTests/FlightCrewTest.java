package PeopleTests;

import People.FlightCrew;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightCrewTest {

    private FlightCrew captain;
    private FlightCrew firstOfficer;

    @Before
    public void before() {
        captain = new FlightCrew("Cptn. Jeffry Striker", Rank.CAPTAIN, "STRIK711269JS6XX");
        firstOfficer = new FlightCrew("Shane Byrne", Rank.FO, "BYRNE812128SB7FE");

    }

    @Test
    public void pilotHasName() {
        assertEquals("Cptn. Jeffry Striker",captain.getName());
    }
}
