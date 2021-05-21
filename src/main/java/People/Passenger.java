package People;

public class Passenger extends Person {

    private int noOfBags;
    private double weightOfBag;
    private String flightNo;
    private int seatNo;

    public Passenger(String name, int noOfBags, double weightOfBag, String flightNo, int seatNo) {
        super(name);
        this.noOfBags = noOfBags;
        this.weightOfBag = weightOfBag;
        this.flightNo = flightNo;
        this.seatNo = seatNo;
    }
}
