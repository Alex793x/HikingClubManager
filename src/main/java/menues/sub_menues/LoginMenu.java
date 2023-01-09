package menues.sub_menues;

import menues.Menu;

public class LoginMenu extends Menu {

    public LoginMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    }

    public LoginMenu() {

    } // End of method

    private LoginMenu loginMenu() {
        return new LoginMenu("LOGIN", "VÆLG VENLIGST", new String[] {
                "1. LOGIN",
                "2. NULSTIL ADGANGSKODE",
                "3. AFSLUT (LOGUD)"
        });
    } // End of method

    private LoginMenu changePasswordMenu() {
        return new LoginMenu("NULSTIL ADGANG", "VÆLG VENLIGST", new String[] {
                "1. GLEMT BRUGERNAVN",
                "2. GLEMT ADGANGSKODE",
                "3. GLEMT BRUGERNAVN OG ADGANGSKODE",
                "0. GÅ TILBAGE"
        });
    } // End of method

    public LoginMenu getLoginMenu() {
        return loginMenu();
    }

    public LoginMenu getChangePasswordMenu() {
        return changePasswordMenu();
    }
}
