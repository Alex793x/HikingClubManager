package controllers;

import handlers.EmployeeHandler;
import handlers.MembershipHandler;
import handlers.PersonHandler;


/*
 * This class represent a controller to direct the flow in and out
 * of all actor classes, and how they are used within this application.
 */
public class ActorController {

    // Attributes -------------------------------
    private final EmployeeHandler employeeHandler;
    private final MembershipHandler membershipHandler;
    private final PersonHandler personHandler;


    // Constructor -------------------------------
    public ActorController() {
        employeeHandler = new EmployeeHandler();
        membershipHandler = new MembershipHandler();
        personHandler = new PersonHandler();
    } // End of method

    // Getter ------------------------------------
    public EmployeeHandler getEmployeeHandler() {
        return employeeHandler;
    } // End of method
    public MembershipHandler getMembershipHandler() {
        return membershipHandler;
    } // End of method
    public PersonHandler getPersonHandler() {
        return personHandler;
    } // End of method
}
