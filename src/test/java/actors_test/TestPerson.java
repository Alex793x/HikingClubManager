package actors_test;

import static org.junit.jupiter.api.Assertions.*;

import actors.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestPerson {
    String testName = "";
    LocalDate testDateOfBirth = LocalDate.of(1993, 2 ,3);
    char testGender = 'a';

    Person testPerson = new Person(testName, testDateOfBirth, testGender);

    @ParameterizedTest
    @ValueSource(strings = {"Henrik", "James", "Marry", "a"})
    @DisplayName("Test Person Name")
    public void testPersonName(String names) {
        Person person = new Person(names, testDateOfBirth, testGender);
//        System.out.println(names); ---- > Test output of names
        assertTrue(person.getName().length() > 0);
    } // End of test method

    @ParameterizedTest
    @ValueSource(strings = {"Henrik", "James", "Marry", "a"})
    @DisplayName("Test Set Name")
    public void testSetPersonName(String names) {
        testPerson.setName(names);
//        System.out.println(names); ---- > Test output of names
        assertTrue(testPerson.getName().length() > 0);
    } // End of test method

    @ParameterizedTest
    @ValueSource( strings= {"1993-02-03", "1991-10-04", "2022-12-19", "2022-08-09"})
    @DisplayName("Test Person DateOfBirth")
    public void testPersonDateOfBirth(String dateOfBirth) {
        Person person = new Person(testName, LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")), testGender);
//        System.out.println(person.getDateOfBirth().getYear()); ----> test output of dateOfBirth
        assertTrue(person.getDateOfBirth().isAfter(LocalDate.of(1990, 1 ,1)));
    } // End of test method

    @ParameterizedTest
    @ValueSource( strings= {"1993-02-03", "1991-10-04", "2022-12-19", "2022-08-09"})
    @DisplayName("Test Set DateOfBirth")
    public void testSetPersonDateOfBirth(String dateOfBirth) {
        testPerson.setDateOfBirth(LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        assertTrue(testPerson.getDateOfBirth().isAfter(LocalDate.of(1990, 1 ,1)));
    } // End of test method

    @Test
    @DisplayName("Test Person AgeGroup")
    public void testPersonAgeGroup() {
        assertEquals(testPerson.getAgeGroup(), Person.AgeGroup.ADULT);
    } // End of test method

    @ParameterizedTest
    @EnumSource(value = Person.AgeGroup.class)
    @DisplayName("Test Person AgeGroup Types")
    public void testPersonAgeGroupTypes(Person.AgeGroup ageGroup) {
//        System.out.println(ageGroup); -----> test output of ageGroup
        assertNotNull(ageGroup);
    } // End of test method

    @ParameterizedTest
    @ValueSource(chars = {'a', 'b', 'c', 'd'})
    @DisplayName("Test Person Gender")
    public void testPersonGender(char gender) {
        Person person = new Person(testName, testDateOfBirth, gender);
//        System.out.println(gender); -----> test output of gender
        assertNotEquals('\u0000', person.getGender()); // '\u0000' is null of char
    } // End of test method

}
