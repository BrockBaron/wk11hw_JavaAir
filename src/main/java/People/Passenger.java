package People;

public class Passenger extends Person {

    private int noOfBags;
    private double weightOfEachBag;
    private String flightNo;
    private String seatNo;

    public Passenger(String name, int noOfBags, double weightOfEachBag, String flightNo, String seatNo) {
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

    public String getSeatNo() {
        return this.seatNo;
    }

    public double getTotalBaggageWeight() {
        return this.noOfBags * this.weightOfEachBag;
    }


}

