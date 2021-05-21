package PeopleTests;

import People.CabinCrew;
import People.Rank;
import org.junit.Before;

public class CabinCrewTest {

    private CabinCrew purser;
    private CabinCrew flightAttendant;
    private String relayCaution;

    @Before
    public void before(){
        purser = new CabinCrew("Richard Branson", Rank.PURSER);
        flightAttendant = new CabinCrew("Shia LeBuff", Rank.ATTENDANT);
        relayCaution = "Please be careful on the steps as you alight from the aircraft, it has been raining";





    }
}
