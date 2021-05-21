package People;

public class CabinCrew extends Person{

    private Rank rank;
    private Person name;

    public CabinCrew(String name, Rank rank) {
        super(name);
        this.rank = rank;
        String caution = "Please be careful on the steps as you alight from the aircraft, it has been raining";
        String scratchCards = "Scratchcards, 5 Euros for 3!";
        String peanuts = "Eat yer effin peanuts!";
    }


    public Rank getRank() {
        return rank;
    }


}
