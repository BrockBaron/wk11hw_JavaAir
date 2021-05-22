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

    public String getAircraftType(){
        return this.fleet.getAircraftType();
    }

    public String getPropulsionType() {
        return this.fleet.getPropulsionType();
    }

    public int getCabinCrewCapacity() {
        return this.fleet.getCabinCrewCap();
    }

    public int getFlightCrewCapacity() {
        return this.fleet.getFlightCrewCap();
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
