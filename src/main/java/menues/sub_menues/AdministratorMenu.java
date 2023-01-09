package menues.sub_menues;

import menues.Menu;

public class AdministratorMenu extends Menu {

    // Constructor ----------------------------------------------------------------------
    public AdministratorMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    } // End of method

    public AdministratorMenu() {

    } // End of method

    // Menu constructor methods ---------------------------------------------------------
    private AdministratorMenu administratorHeadMenu() {
        return new AdministratorMenu(
                "ADMINISTRATOR MENU", "VÆLG VENLIGST", new String[]{
                "1. NYT MEDLEM",
                "2. ÆNDRE MEDLEMS INFO",
                "3. SLET MEDLEM",
                "4. TILFØJ NY DESTINATION",
                "5. ÆNDRE DISTINATION INFO",
                "6. SLET DISTINATION",
                "7. TILFØJ NY GUIDE",
                "8. ÆNDRE GUIDE INFO",
                "9. SLET GUIDE",
                "0. LOG UD"
        });
    } // end of method

    private AdministratorMenu changeMemberMenu() {
        return new AdministratorMenu(
                "ÆNDRE MEDLEMS INFO", "VÆLG VENLIGST", new String[]{
                "1. ÆNDRE MEDLEMS-STATUS",
                "2. ÆNDRE NAVN",
                "3. ÆNDRE TELEFON NR",
                "4. ÆNDRE KØN",
                "0. GÅ TILBAGE"
        });
    } // End of method


    // Accessor methods -----------------------------------------
    public AdministratorMenu getAdministratorHeadMenu() {
        return administratorHeadMenu();
    } // End of method

    public AdministratorMenu getChangeMemberMenu() {
        return changeMemberMenu();
    } // End of method

}
