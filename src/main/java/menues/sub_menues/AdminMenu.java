package menues.sub_menues;

import menues.Menu;

public class AdminMenu extends Menu {

    // Constructor ------------------------------------------------------
    public AdminMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    } // End of method

    public AdminMenu() {

    } // End of method

    // Menu Constructor methods ------------------------------------------
    private AdminMenu adminMenu() {
        return new AdminMenu("ADMIN MENU", "VÆLG VENLIGST", new String[] {
                "1. RESET SYSTEM",
                "2. ÆNDRE BRUGERNAVN",
                "3. ÆNDRE KODEORD",
                "4. BRUGER OPSÆTNINGS MENU",
                "0. LOG UD"
        });
    } // End of method

    private AdminMenu adminUserChangeMenu() {
        return new AdminMenu("BRUGER OPSÆTNING", "VÆLG VENLIGST", new String[] {
                "1. SE BRUGERE",
                "2. ÆNDRE BRUGERS BRUGERNAVN",
                "3. ÆNDRE BRUGERS KODEORD",
                "4. OPRET NY ADMIN / ADMINISTRATOR BRUGER",
                "0. GÅ TILBAGE"
        });
    } // End of method


    // Accessor methods ------------------------------------------------
    public AdminMenu getAdminMenu() {
        return adminMenu();
    } // End of method

    public AdminMenu getAdminUserChangeMenu() {
        return adminUserChangeMenu();
    } // end of method
}
