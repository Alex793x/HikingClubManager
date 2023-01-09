package menues.sub_menues;

import menues.Menu;

public class GuideMenu extends Menu {

    public GuideMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    }

    public GuideMenu() {

    } // End of method

    private GuideMenu guideMenu() {
        return new GuideMenu("GUIDE MENU", "VÆLG VENLIGST", new String[] {
                "1. SE KOMMENDE EKSPEDITIONER",
                "2. SE AFHOLDTE EKSPEDITIONER",
                "3. SE DELTAGER LISTE",
                "4. SE ÅBNE EKSPEDITIONER",
                "5. SE LØN",
                "0. LOG UD"
        });
    } // End of method

    public GuideMenu getGuideMenu() {
        return guideMenu();
    } // End of method
}
