package destinations;

/*
 * This class represents a Destination for a Hiking trip,
 * this includes, difficulty, name, route and distance
 */
public class Destination {

    // Enum Attributes ------------------
    public enum HikingDifficulty {
        BEGINNER,
        INTERMEDIATE,
        ADVANCED,
        EXPERT,
        ELITE
    }

    // Attributes ------------------------
    HikingDifficulty hikingDifficulty;
    private String destinationName;
    private String hikingRoute;
    private double hikingDistance;

    // Constructor -----------------------
    public Destination(HikingDifficulty difficulty, String destinationName, String hikingRoute, double hikingDistance) {
        this.hikingDifficulty = difficulty;
        this.destinationName = destinationName;
        this.hikingRoute = hikingRoute;
        this.hikingDistance = hikingDistance;
    } // End of method

    // Getter ----------------------------
    public HikingDifficulty getHikingDifficulty() {
        return hikingDifficulty;
    } // End of method
    public String getDestinationName() {
        return destinationName;
    } // End of method
    public String getHikingRoute() {
        return hikingRoute;
    } // End of method
    public double getHikingDistance() {
        return hikingDistance;
    } // End of method

    // Setter ----------------------------
    public void setHikingDifficulty(HikingDifficulty hikingDifficulty) {
        this.hikingDifficulty = hikingDifficulty;
    } // End of method
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    } // End of method
    public void setHikingRoute(String hikingRoute) {
        this.hikingRoute = hikingRoute;
    } // End of method
    public void setHikingDistance(double hikingDistance) {
        if (hikingDistance > 0) {
            this.hikingDistance = hikingDistance;
        } else {
            this.hikingDistance = 0;
        } // End of if - else statement
    } // End of method
}
