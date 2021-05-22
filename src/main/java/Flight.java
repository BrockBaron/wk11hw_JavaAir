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

    public Flight(ArrayList<FlightCrew> flightCrews, ArrayList<CabinCrew> cabinCrews, Aircraft aircraft, String flightNo, String destination, String departure, String departureTime) {
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
        return aircraft.getPaxCapacity();
    }


    public int getFlightCrewCapacity() {
        return aircraft.getFlightCrewCapacity();
    }

    public int getCabinCrewCapacity() {
        return this.aircraft.getCabinCrewCapacity();
    }

    public int flightCrewCount() {
        return this.flightCrews.size();
    }

    public int cabinCrewCount() {
        return this.cabinCrews.size();
    }

    public int getPaxCount() {
        return this.passengers.size();
    }


    public int getAvailablePaxCapacity() {
        return this.getPaxCount() - this.getPaxCapacity();
    }

    public boolean hasCapacity() {
        return this.getPaxCount() < this.getPaxCapacity();
    }



    public void addPassenger(Passenger passenger) {
            this.passengers.add(passenger);
    }




//
//    public void addBook(Book book) {
//        if (hasCapacity()) {
//            this.collection.add(book);
//            this.addToGenreHashmap(book);
//        }
//    }


}









    //    add passenger to flightList



//    calculate available seats
//    return
//    aircraft.getPaxCapacity() - passengerCount





