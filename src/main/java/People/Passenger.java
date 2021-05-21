package People;

public class Passenger extends Person {

    private int NoOfBags;

    public Passenger(String name, int noOfBags) {
        super(name);
        NoOfBags = noOfBags;
    }
}
