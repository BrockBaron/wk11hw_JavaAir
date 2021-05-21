import People.CabinCrew;
import People.FlightCrew;
import People.Passenger;
import Vehicles.Aircraft;

import java.util.ArrayList;

public class Flight {


    private ArrayList<FlightCrew> flightCrews;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;

    private Aircraft aircraft;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight() {
        this.flightCrews = new ArrayList<>();
        this.cabinCrews = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.aircraft = aircraft;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }


    public void addFlightCrew(FlightCrew flightCrew) {
        this.flightCrews.add(flightCrew);
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrews.add(cabinCrew);
        }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

}








    //    add passenger to flightList

//    add flight crew personnel to Array list
//    add cabin crew personnel to array list


//    calculate available seats
//    return
//    aircraft.getPaxCapacity() - passengerCount





