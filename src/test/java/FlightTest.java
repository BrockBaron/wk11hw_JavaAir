import People.CabinCrew;
import People.FlightCrew;
import People.Passenger;
import People.Rank;
import Vehicles.Aircraft;
import Vehicles.Fleet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


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
    Passenger passenger19;
    Passenger passenger20;

    ArrayList<FlightCrew> flightCrew;
    ArrayList<CabinCrew> cabinCrew;

    @Before
    public void before() {

        flightCrew = new ArrayList<>();
        pilot = new FlightCrew("Cptn. Jeffry Striker", Rank.CAPTAIN, "STRIK711269JS6XX");
        coPilot = new FlightCrew("Shane Byrne", Rank.SFO, "BYRNE812128SB7FE");
        flightCrew.add(pilot);
        flightCrew.add(coPilot);

        cabinCrew = new ArrayList<>();
        purser = new CabinCrew("Richard Branson", Rank.PURSER);
        flightAttendant = new CabinCrew("Shia LeBuff", Rank.ATTENDANT);
        cabinCrew.add(purser);
        cabinCrew.add(flightAttendant);


        aircraft = new Aircraft(Fleet.TWINOTTER, "G-JMAC");
        flightNo = "LM0397";

        destination = "EDI";
        departure = "KOI";
        departureTime = "11:58";


        passenger1 = new Passenger("Stan Smith", 2, 12.50, flightNo, 1);
        passenger2 = new Passenger("Piers Neal", 1, 10.50, flightNo, 2);
        passenger3 = new Passenger("Yvette Vasquez", 3, 8.50, flightNo, 3);
        passenger4 = new Passenger("Nancy Hutchinson", 2, 9.50, flightNo, 4);
        passenger5 = new Passenger("Molly Franklin", 1, 21.50, flightNo, 5);
        passenger6 = new Passenger("Philbert Harper", 2, 14.50, flightNo, 6);
        passenger7 = new Passenger("Darren Bradley", 3, 10.50, flightNo, 7);
        passenger8 = new Passenger("Cade Johnston", 1, 17.50, flightNo, 8);
        passenger9 = new Passenger("Herb Austin", 2, 13.50, flightNo, 9);
        passenger10 = new Passenger("Emerson Nicholson", 3, 5.50, flightNo, 10);
        passenger11 = new Passenger("Gina Pascall", 1, 21.50, flightNo, 11);
        passenger12 = new Passenger("Norman Lowe", 2, 14.0, flightNo, 12);
        passenger13 = new Passenger("Teri Stevens", 3, 8.50, flightNo, 13);
        passenger14 = new Passenger("Grant Mills", 1, 10.50, flightNo, 14);
        passenger15 = new Passenger("Ginger Clarke", 2, 10.50, flightNo, 15);
        passenger16 = new Passenger("Ed Salvage", 3, 6.50, flightNo, 16);
        passenger17 = new Passenger("Hazel Badman", 1, 16.50, flightNo, 17);
        passenger18 = new Passenger("Gary Robinson", 0, 0.0, flightNo, 18);
        passenger19 = new Passenger("Duncan Black", 0, 12.50, flightNo, 19);
        passenger20 = new Passenger("Truman Poole", 3, 14.50, flightNo, 19);

        flight = new Flight(flightCrew, cabinCrew, aircraft, flightNo, destination, departure, departureTime);

        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        flight.addPassenger(passenger7);
        flight.addPassenger(passenger8);
        flight.addPassenger(passenger9);
        flight.addPassenger(passenger10);
        flight.addPassenger(passenger11);
        flight.addPassenger(passenger12);
        flight.addPassenger(passenger13);
        flight.addPassenger(passenger14);
        flight.addPassenger(passenger15);
        flight.addPassenger(passenger16);
        flight.addPassenger(passenger17);
        flight.addPassenger(passenger18);
        flight.addPassenger(passenger19);
//        flight.addPassenger(passenger20);


    }

    @Test
    public void canGetAircraft() {
        assertEquals("Twin Otter", flight.getAircraft());
    }

    @Test
    public void flightHasFlightNo() {
        assertEquals("LM0397", flight.getFlightNo());
    }

    @Test
    public void flightHasDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    public void flightHasDeparture() {
        assertEquals("KOI", flight.getDeparture());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals("11:58", flight.getDepartureTime());
    }




    // get capacity of people specified for aircraft
    @Test
    public void canReturnPaxCapacity() {
        assertEquals(19, flight.getPaxCapacity());
    }
    @Test
    public void canReturnFlightCrewCapacity() {
        assertEquals(2, flight.getFlightCrewCapacity());
    }
    @Test
    public void canReturnCabinCrewCapacity() {
        assertEquals(2, flight.getCabinCrewCapacity());
    }
//
////add crew to aircraft and return quantity
//    @Test
//    public void canAddFlightCrewToAircraft() {
//        assertEquals(2, flight.flightCrewCount());
//    }
//
//    @Test
//    public void canAddCabinCrewToAircraft() {
//        assertEquals(2, flight.cabinCrewCount());
//    }
//
//
}
