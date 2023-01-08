package actors_Test;

import actors.Employee;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Test Employee Class")
class TestEmployee {

    @ParameterizedTest
    @EnumSource(value = Employee.Employment.class)
    @DisplayName("Test Employment Type")
    public void testEmployeeEmployment(Employee.Employment employment) {
        Employee employee = new Employee("","", "", employment);
        assertNotNull(employee.getEmployment());
    }

    @ParameterizedTest
    @EnumSource(value = Employee.Employment.class)
    @DisplayName("Test Set Employment")
    public void testSetEmployeeEmployment(Employee.Employment employment) {
        Employee employee = new Employee("","", "", Employee.Employment.GUIDE);
        employee.setEmployment(employment);
        assertNotNull(employee.getEmployment());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Henrik", "Hamilton", "Jonathan"})
    @DisplayName("Test Employee Name")
    public void testEmployeeName(String name) {
        Employee employee = new Employee("", "", name, Employee.Employment.ADMIN);
        assertTrue(employee.getEmployeeName().length() > 0);
    }
    @ParameterizedTest
    @ValueSource(strings = {"Henrik", "Hamilton", "Jonathan"})
    @DisplayName("Test Set Name")
    public void testSetEmployeeName(String name) {
        Employee employee = new Employee("", "", "", Employee.Employment.ADMIN);
        employee.setEmployeeName(name);
        assertTrue(employee.getEmployeeName().length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Admin1234", "GuideMe1234", "EconUp1234"})
    @DisplayName("Test Employee Username")
    public void testEmployeeUsername(String username) {
        Employee employee = new Employee(username, "", "", Employee.Employment.ADMIN);
        System.out.println(employee.getUsername());
        assertTrue(employee.getUsername().length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Admin1234", "GuideMe1234", "EconUp1234"})
    @DisplayName("Test Set Username")
    public void testSetEmployeeUsername(String username) {
        Employee employee = new Employee("", "", "", Employee.Employment.ADMIN);
        employee.setUsername(username);
        System.out.println(employee.getUsername());
        assertTrue(employee.getUsername().length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"qwer", "1234", "zxcv"})
    @DisplayName("Test Employee Password")
    public void testEmployeePassword(String password) {
        Employee employee = new Employee("", password, "", Employee.Employment.ADMIN);
        System.out.println(employee.getPassword());
        assertTrue(employee.getPassword().length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"qwer", "1234", "zxcv"})
    @DisplayName("Test Set Password")
    public void testSetEmployeePassword(String password) {
        Employee employee = new Employee("", "", "", Employee.Employment.ADMIN);
        employee.setPassword(password);
        System.out.println(employee.getPassword());
        assertTrue(employee.getPassword().length() > 0);
    }



}