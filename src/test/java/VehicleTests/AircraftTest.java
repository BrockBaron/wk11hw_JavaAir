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
        aircraft = new Aircraft(Fleet.BRITTENNI, "G-BJEC");
        aircraft1 = new Aircraft(Fleet.TWINOTTER, "VP-FAZ");
        aircraft2 = new Aircraft(Fleet.EMBREARJ135, "G-SUGR");
        aircraft3 = new Aircraft(Fleet.JETSTREAM41,"G-JMAC" );
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
    public void aircraftHasCabinCrewCapacity() {
        assertEquals(1, aircraft1.getCabinCrewCapacity());
    }

    @Test
    public void aircraftHasFlightCrewCapacity() {
        assertEquals(2, aircraft1.getFlightCrewCapacity());
    }

    @Test
    public void aircraftHasPaxCapacity() {
        assertEquals(29, aircraft3.getPaxCapacity());
    }

    @Test
    public void aircraftHasCargoCapacity() {
        assertEquals(54.4, aircraft.getLuggageCapacity(), 0.1);
    }

    @Test
    public void aircraftHasCallSignal() {
        assertEquals("G-JMAC", aircraft3.getCallSign());
    }
}
