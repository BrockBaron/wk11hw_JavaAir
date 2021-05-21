package People;

public class FlightCrew extends Person{

    private Rank rank;
    private String licenceNo;
    private String flyAircraft;

    public FlightCrew(String name, Rank rank, String licenceNo) {
        super(name);
        this.rank = rank;
        this.licenceNo = licenceNo;
        this.flyAircraft = "I drive the coach, yes?!";
    }


    public Rank getRank() {
        return this.rank;
    }

    public String getLicense() {
        return licenceNo;
    }

    public String getFlyAircraft() {
        return flyAircraft;
    }

}
