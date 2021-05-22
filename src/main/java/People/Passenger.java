package People;

import Vehicles.Aircraft;

import java.util.Random;

public class Passenger extends Person {

    private int noOfBags;
    private double weightOfEachBag;
    private String flightNo;
    private int seatNo;

    public Passenger(String name, int noOfBags, double weightOfEachBag, String flightNo, int seatNo) {
        super(name);
        this.noOfBags = noOfBags;
        this.weightOfEachBag = weightOfEachBag;
        this.flightNo = flightNo;
        this.seatNo = seatNo;
    }

    public int baggageCount() {
        return this.noOfBags;
    }

    public double baggageWeight() {
        return this.weightOfEachBag;
    }

    public String getFlightNo() {
        return this.flightNo;
    }


    public int getRandomNumberInRange(int min, int max) {

        Random randomNumber = new Random();
        return randomNumber.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }
    public int getSeatNo() {
//        return this.seatNo;

        return getRandomNumberInRange(0, aircraft.getPaxCapacity());
    }




    public double getTotalBaggageWeight() {
        return this.noOfBags * this.weightOfEachBag;
    }


}

