package PeopleTests;

import People.FlightCrew;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightCrewTest {

    private FlightCrew pilot;
    private FlightCrew coPilot;

    @Before
    public void before() {
        pilot = new FlightCrew("Cptn. Jeffry Striker", Rank.CAPTAIN, "STRIK711269JS6XX");
        coPilot = new FlightCrew("Shane Byrne", Rank.FO, "BYRNE812128SB7FE");

    }

    @Test
    public void pilotHasName() {
        assertEquals("Cptn. Jeffry Striker",pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }
}