package Vehicles;

public enum Fleet {

    BRITTENNI("Twin-TurboProp", 2, 0, 8, 55.0),
    TWINOTTER("Twin-TurboProp", 2, 1, 19, 726.00),
    EMBREARJ135("Jet",2, 2,37, 1353.0),
    JETSTREAM41("Jet", 2, 2,29, 1056.0 );

    private final String propulsionType;
    private final int flightCrewCap;
    private final int cabinCrewCap;
    private final int paxCap;
    private final double luggageCap;

    Fleet(String propulsionType, int flightCrewCap, int cabinCrewCap, int paxCap, double luggageCap) {
        this.propulsionType = propulsionType;
        this.flightCrewCap = flightCrewCap;
        this.cabinCrewCap = cabinCrewCap;
        this.paxCap = paxCap;
        this.luggageCap = luggageCap;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public int getCabinCrewCap() {
        return cabinCrewCap;
    }

    public int getFlightCrewCap() {
        return flightCrewCap;
    }

    public int getPaxCap() {
        return paxCap;
    }

    public double getLuggageCap() {
        return luggageCap;
    }
}
