package Vehicles;

public enum Fleet {

    BRITTENNI("Britten Northern Islander","Twin-TurboProp", 2, 0, 8, 55.0),
    TWINOTTER("Twin Otter","Twin-TurboProp", 2, 1, 19, 726.00),
    EMBREARJ135("Embrear J135","Jet",2, 2,37, 1353.0),
    JETSTREAM41("Jetstream 41","Jet", 2, 2,29, 1056.0 );

    private final String aircraftName;
    private final String propulsionType;
    private final int flightCrewCap;
    private final int cabinCrewCap;
    private final int paxCap;
    private final double luggageCap;

    Fleet(String aircraftName,String propulsionType, int flightCrewCap, int cabinCrewCap, int paxCap, double luggageCap) {
        this.aircraftName = aircraftName;
        this.propulsionType = propulsionType;
        this.flightCrewCap = flightCrewCap;
        this.cabinCrewCap = cabinCrewCap;
        this.paxCap = paxCap;
        this.luggageCap = luggageCap;
    }

    public String getAircraftType() {
        return aircraftName;
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
