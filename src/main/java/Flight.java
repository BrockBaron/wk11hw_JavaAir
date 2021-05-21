import People.CabinCrew;
import People.FlightCrew;
import People.Passenger;
import Vehicles.Aircraft;

import java.util.ArrayList;

public class Flight {


    private ArrayList<FlightCrew> flightCrew;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passenger;
    private Aircraft aircraft;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(ArrayList<FlightCrew> flightCrew, ArrayList<CabinCrew> cabinCrew, ArrayList<Passenger> passenger, Aircraft aircraft, String flightNo, String destination, String departure, String departureTime) {
        this.flightCrew = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passenger = new ArrayList<>();
        this.aircraft = aircraft;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

//    add passenger to flight
//    calculate available seats
}
