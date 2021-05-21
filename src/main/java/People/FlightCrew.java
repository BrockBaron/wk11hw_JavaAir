package People;

public class FlightCrew extends Person{

    private Rank rank;
    private String licenceNo;
    private String flyAircraft;
    private String mayday;

    public FlightCrew(String name, Rank rank, String licenceNo) {
        super(name);
        this.rank = rank;
        this.licenceNo = licenceNo;
        this.flyAircraft = "I drive the coach, yes?!";
        this.mayday = "I'll save you!";
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

    public String getMayDay() {
        return mayday;
    }

}
