package PeopleTests;

import People.CabinCrew;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    private CabinCrew purser;
    private CabinCrew flightAttendant;


    @Before
    public void before(){
        purser = new CabinCrew("Richard Branson", Rank.PURSER);
        flightAttendant = new CabinCrew("Shia LeBuff", Rank.ATTENDANT);
    }


    @Test
    public void CabinCrewHasName() {
        assertEquals("Richard Branson",purser.getName());
    }

    @Test
    public void cabinCrewHasRank() {
        assertEquals(Rank.ATTENDANT, flightAttendant.getRank());
    }

    @Test
    public void canWarnPassengers() {
        assertEquals("Please be careful on the steps as you alight from the aircraft, it has been raining", flightAttendant.alightWarning());
    }
}
