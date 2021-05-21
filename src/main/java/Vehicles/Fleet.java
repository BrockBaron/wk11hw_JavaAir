package Vehicles;

public enum Fleet {

    BRITTENNI("Twin-TurboProp", 2, 8, 54.4),
    TWINOTTER("Twin-TurboProp", 3, 19, 627.0),
    EMBREARJ135("Jet",4,37, 1353.0),
    JETSTREAM41("Jet", 4,29, 957.0 );

    private final String propulsionType;
    private final int crewCap;
    private final int paxCap;
    private final double luggageCap;

    Fleet(String propulsionType, int crewCap, int paxCap, double luggageCap) {
        this.propulsionType = propulsionType;
        this.crewCap = crewCap;
        this.paxCap = paxCap;
        this.luggageCap = luggageCap;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public int getCrewCap() {
        return crewCap;
    }

    public int getPaxCap() {
        return paxCap;
    }

    public double getLuggageCap() {
        return luggageCap;
    }
}
