package Vehicles;

public class Aircraft {

    private Fleet fleet;

    public Aircraft(Fleet fleet) {
        this.fleet = fleet;
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
}
