package People;

public class CabinCrew extends Person{

    private Rank rank;
    private Person name;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }
}
