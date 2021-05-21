package VehicleTests;

import Vehicles.Aircraft;
import Vehicles.Fleet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AircraftTest {

    private Aircraft aircraft;
    private Aircraft aircraft1;
    private Aircraft aircraft2;
    private Aircraft aircraft3;

    @Before

    public void before() {
        aircraft = new Aircraft(Fleet.BRITTENNI);
        aircraft1 = new Aircraft(Fleet.TWINOTTER);
        aircraft2 = new Aircraft(Fleet.EMBREARJ135);
        aircraft3 = new Aircraft(Fleet.JETSTREAM41);
    }



    @Test
    public void canGetFleetType() {
        assertEquals(Fleet.BRITTENNI, aircraft.getFleetType());
    }

    @Test
    public void aircraftHasPropulsionType() {
        assertEquals("Jet", aircraft2.getPropulsionType());
    }

    @Test
    public void aircraftHasCrewCapacity() {
        assertEquals(3, aircraft1.getCrewCapacity());
    }

    @Test
    public void aircraftHasPaxCapacity() {
        assertEquals(29, aircraft3.getPaxCapacity());
    }



}
