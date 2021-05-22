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

    public Flight(ArrayList<FlightCrew> flightCrews,ArrayList<CabinCrew> cabinCrews, Aircraft aircraft, String flightNo, String destination, String departure, String departureTime) {
        this.flightCrews = flightCrews;
        this.cabinCrews = cabinCrews;
        this.passengers = new ArrayList<>();
        this.aircraft = aircraft;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }




    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getAircraft() {
        return aircraft.getAircraftType();
    }



    public int getPaxCapacity() {
        return aircraft.getCabinCrewCapacity();
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





