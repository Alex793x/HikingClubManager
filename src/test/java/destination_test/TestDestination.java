package destination_test;
import destinations.Destination;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TestDestination {
    Destination.HikingDifficulty testHikingDifficulty = Destination.HikingDifficulty.BEGINNER;
    String testDestinationName = "test";
    String testHikingRoute = "test";
    double testDistance = 5.0;

    Destination testDestination = new Destination(testHikingDifficulty, testDestinationName, testHikingRoute, testDistance);

    @ParameterizedTest
    @EnumSource(value = Destination.HikingDifficulty.class)
    @DisplayName("Test Destination Hiking Difficulty")
    public void testHikingDifficulty(Destination.HikingDifficulty hikingDifficulty) {
        assertEquals(testDestination.getHikingDifficulty(), Destination.HikingDifficulty.BEGINNER);
        testDestination.setHikingDifficulty(null);
        assertNull(testDestination.getHikingDifficulty());
        testDestination.setHikingDifficulty(hikingDifficulty);
        assertNotNull(testDestination.getHikingDifficulty());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mols Bjerge National Park", "Rold Skov", "Grib Skov", "Rebild Bakker"})
    @DisplayName("Test Destination Name")
    public void testDestinationName(String destinationNames) {
        assertEquals(testDestination.getDestinationName(), "test");
        testDestination.setDestinationName(destinationNames);
        assertNotSame("test", testDestination.getDestinationName());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hærvejen", "Gendarmstien", "Øhavsstien", "Sjællandsleden", "Bornholms kyststi"})
    @DisplayName("Test Destination Hiking Routes")
    public void testDestinationHikingRoute(String hikingRoutes) {
        assertEquals(testDestination.getHikingRoute(), "test");
        testDestination.setHikingRoute(hikingRoutes);
        assertNotSame("test", testDestination.getHikingRoute());
    }

    @ParameterizedTest
    @ValueSource(doubles = {280.0, 84.0, 220.0, 400.0, 115.0, 1.0})
    @DisplayName("Test Destination Hiking Distances")
    public void testDestinationHikingDistances(double hikingDistance) {
        assertEquals(testDestination.getHikingDistance(), 5.0);
        testDestination.setHikingDistance(hikingDistance);
        assertNotSame(0.0, testDestination.getHikingDistance());
        assertNotSame(5.0, testDestination.getHikingDistance());
    }

}
