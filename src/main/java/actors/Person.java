package actors;

import java.time.LocalDate;
import java.time.Period;

/*
 * This class represent all info about a Person;
 * Name, Age, AgeGroup, Gender etc
 */
public class Person {
    // Enum Class
    public enum AgeGroup {
        JUNIOR,
        ADULT,
        SENIOR
    }

    // Attributes --------------------------
    private String name;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private AgeGroup ageGroup;
    private char gender;

    // Constructor -------------------------
    public Person(String name, LocalDate dateOfBirth, char gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        setAgeGroup();
    } // End of method

    // Getter ------------------------------
    public String getName() {
        return name;
    } // End of method
    public String getPhoneNumber() {
        return phoneNumber;
    } // End of method

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    } // End of method

    public AgeGroup getAgeGroup() {
        return ageGroup;
    } // End of method

    public char getGender() {
        return gender;
    } // End of method

    // Setter ------------------------------
    public void setName(String name) {
        this.name = name;
    } // End of method

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    } // End of method

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    } // End of method

    private void setAgeGroup() {
        int period = Period.between(dateOfBirth, LocalDate.now()).getYears();

        if (period < 18) {
            ageGroup = AgeGroup.JUNIOR;
        } else if (period > 18 && period < 60) {
            ageGroup = AgeGroup.ADULT;
        } else {
            ageGroup = AgeGroup.SENIOR;
        } // End of if statement
    } // End of method

    public void setGender(char gender) {
        this.gender = gender;
    } // End of method
}
