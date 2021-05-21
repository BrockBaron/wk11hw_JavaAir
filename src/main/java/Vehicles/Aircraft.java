package Vehicles;

public class Aircraft {

    private Fleet fleet;
    private String callSign;

    public Aircraft(Fleet fleet, String callSign) {
        this.fleet = fleet;
        this.callSign = callSign;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public Fleet getFleetType() {
        return this.fleet;
    }

    public String getPropulsionType() {
        return this.fleet.getPropulsionType();
    }

    public int getCrewCapacity() {
        return this.fleet.getCrewCap();
    }

    public int getPaxCapacity() {
        return this.fleet.getPaxCap();
    }


    public double getLuggageCapacity() {
        return this.fleet.getLuggageCap();
    }

    public String getCallSign() {
        return this.callSign;
    }
}
