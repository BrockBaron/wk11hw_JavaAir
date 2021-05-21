import People.CabinCrew;
import People.FlightCrew;
import People.Passenger;
import People.Rank;
import Vehicles.Aircraft;
import Vehicles.Fleet;
import org.junit.Before;
import org.junit.Test;


public class FlightTest {

    Flight flight;

    FlightCrew pilot;
    FlightCrew coPilot;


    CabinCrew purser;
    CabinCrew flightAttendant;

    Aircraft aircraft;

    String flightNo;
    String destination;
    String departure;
    String departureTime;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;
    Passenger passenger7;
    Passenger passenger8;
    Passenger passenger9;
    Passenger passenger10;
    Passenger passenger11;
    Passenger passenger12;
    Passenger passenger13;
    Passenger passenger14;
    Passenger passenger15;
    Passenger passenger16;
    Passenger passenger17;
    Passenger passenger18;


    @Before
    public void before() {
        flight = new Flight(aircraft, flightNo, destination, departure, departureTime);

        pilot = new FlightCrew("Cptn. Jeffry Striker", Rank.CAPTAIN, "STRIK711269JS6XX");
        coPilot = new FlightCrew("Shane Byrne", Rank.SFO, "BYRNE812128SB7FE");

        purser = new CabinCrew("Richard Branson", Rank.PURSER);
        flightAttendant = new CabinCrew("Shia LeBuff", Rank.ATTENDANT);

        aircraft = new Aircraft(Fleet.TWINOTTER,"G-JMAC" );
        flightNo = "LM0397";

        destination = "EDI";
        departure = "KOI";
        departureTime = "11:58";


        flight.addFlightCrew(pilot);
        flight.addFlightCrew(coPilot);

        flight.addCabinCrew(purser);
        flight.addCabinCrew(purser);

        flight.addPassenger(passenger1);

        passenger1 = new Passenger("Stan Smith", 2, 12.50, flightNo, "A1");

    }

    @Test
    public void name() {
    }
}
