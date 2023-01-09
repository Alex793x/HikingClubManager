package utilities;

import utilities.destination_print.DestinationPrint;
import utilities.employee_print.EmployeePrint;
import utilities.membership_print.MembershipPrint;
import utilities.person_print.PersonPrint;
import utilities.ui_print.UIPrint;

public class SystemPrint {

    // Attributes ------------------------------
    private final EmployeePrint employeePrint;
    private final MembershipPrint membershipPrint;
    private final PersonPrint personPrint;
    private final DestinationPrint destinationPrint;
    private final UIPrint uiPrint;


    // Constructor ----------------------------
    public SystemPrint() {
        employeePrint = new EmployeePrint();
        membershipPrint = new MembershipPrint();
        personPrint = new PersonPrint();
        destinationPrint = new DestinationPrint();
        uiPrint = new UIPrint();
    } // End of method


    // Getter ---------------------------------
    public EmployeePrint getEmployeePrint() {
        return employeePrint;
    } // End of method

    public MembershipPrint getMembershipPrint() {
        return membershipPrint;
    } // End of method

    public PersonPrint getPersonPrint() {
        return personPrint;
    } // End of method

    public DestinationPrint getDestinationPrint() {
        return destinationPrint;
    } // End of method

    public UIPrint getUiPrint() {
        return uiPrint;
    } //End of method
}
