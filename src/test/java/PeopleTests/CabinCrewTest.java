package PeopleTests;

import People.CabinCrew;
import People.Rank;
import org.junit.Before;

public class CabinCrewTest {

    private CabinCrew purser;
    private CabinCrew flightAttendant;


    @Before
    public void before(){
        purser = new CabinCrew("Richard Branson", Rank.PURSER);
        flightAttendant = new CabinCrew("Shia LeBuff", Rank.ATTENDANT);








    }
}
