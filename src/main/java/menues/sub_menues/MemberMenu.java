package menues.sub_menues;

import menues.Menu;

/*
 * This class represents menus for all members, they can
 * here see their profile, excursions, payments etc.
 * They also have a sub-menu where they can add or change specific info about them self.
 */
public class MemberMenu extends Menu {

    public MemberMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    }

    public MemberMenu() {

    } // End of method

    private MemberMenu memberMenu() {
        return new MemberMenu("MEDLEMS MENU", "VÆLG VENLIGST", new String[]{
                "1. SE DIN PROFIL",
                "2. SE DINE VANDRE TURE",
                "3. SE DINE KOMMENDE EKSPEDITIONER",
                "4. SE DIN SALDO",
                "0. LOG UD"
        });
    } // End of method

    private MemberMenu memberProfileMenu() {
        return new MemberMenu("DIN PROFIL", "VÆLG VENLIGST", new String[] {
                "1. ÆNDRE/TILFØJ EMAIL",
                "2. ÆNDRE/TILFØJ TELEFON",
                "3. ÆNDRE/TILFØJ ADDRESSE",
                "4. ÆNDRE/TILFØJ BETALINGSKORT",
                "5. SKRIV KORT BIO. OM DIG SELV",
                "0. GÅ TILBAGE"
        });
    } // End of method

    public MemberMenu getMemberMenu() {
        return memberMenu();
    } // End of method

    public MemberMenu getMemberProfileMenu() {
        return memberProfileMenu();
    } // End of method
}
