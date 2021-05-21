package People;

public enum Rank {
    CAPTAIN("Captain"),
    FO("First Officer"),
    PURSER("Purser"),
    ATTENDANT("Flight Attendant");

    private final String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
