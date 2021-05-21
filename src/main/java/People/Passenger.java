package People;

public class Passenger extends Person {

    private int noOfBags;
    private double weightOfBag;
    private String flightNo;
    private int seat;

    public Passenger(String name, int noOfBags, double weightOfBag, String flightNo, int seat) {
        super(name);
        this.noOfBags = noOfBags;
        this.weightOfBag = weightOfBag;
        this.flightNo = flightNo;
        this.seat = seat;
    }
}
