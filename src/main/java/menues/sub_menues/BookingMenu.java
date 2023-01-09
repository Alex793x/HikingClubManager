package menues.sub_menues;

import menues.Menu;
public class BookingMenu extends Menu {

    // Constructor ------------------------------------------------------
    public BookingMenu(String menuHeader, String leadText, String[] menuOptions) {
        super(menuHeader, leadText, menuOptions);
    } // End of method

    public BookingMenu() {

    } // End of method

    // Menu Constructor methods ------------------------------------------
    private BookingMenu bookingMenu() {
        return new BookingMenu("BOOKING MENU", "VÆLG VENLIGST", new String[] {
                "1. SE DESTINATION",
                "2. SE VANDRE RUTER",
                "3. BOOK VANDRETUR",
                "4. ANNULLER VANDRETUR",
                "5. SE DINE VANDRETURE",
                "0. LOG UD"
        });
    } // End of method

    // Accessor methods ----------------------------------------------------
    public BookingMenu getBookingMenu() {
        return bookingMenu();
    } // End of method



}
