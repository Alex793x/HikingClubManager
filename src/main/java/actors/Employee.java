package actors;

/*
 * This class represent an Employee,
 * Uniquely it also
 */
public class Employee {

    // Attributes (Enum) --------------------------
    public enum Employment {
        ADMIN,
        ADMINISTRATOR,
        ECONOMY_MANAGEMENT,
        GUIDE,
    }

    // Attributes ---------------------------------
    private String username;
    private String password;
    private String employeeName;
    private static int ID = 100;
    private final int uniqueID = ID++;
    Employment employment;

    // Constructor --------------------------------
    public Employee(String username, String password, String employeeName, Employment employment) {
        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
        this.employment = employment;
    }

    // Getters ------------------------------------
    public Employment getEmployment() {
        return employment;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    int getUniqueID() {
        return uniqueID;
    }

    // Setter -------------------------------------

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployment(Employment employment) {
        this.employment = employment;
    }
}
