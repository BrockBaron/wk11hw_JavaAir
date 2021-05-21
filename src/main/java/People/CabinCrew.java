package People;

public class CabinCrew extends Person{

    private Rank rank;
    private Person name;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }


    public Rank getRank() {
        return rank;
    }


    public String alightWarning() {
        return "Please be careful on the steps as you alight from the aircraft, it has been raining";
    }


    public String sellScratchys() {
        return "Scratchcards, 5 Euros for 3!";
    }
}
