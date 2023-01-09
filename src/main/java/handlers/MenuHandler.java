package handlers;

import menues.sub_menues.*;

/*
 * This class is handling all the flow of all menus in the application
 */
public class MenuHandler {
    // Attributes ---------------------------------------------
    private final AdminMenu adminMenu;
    private final AdministratorMenu administratorMenu;
    private final BookingMenu bookingMenu;
    private final GuideMenu guideMenu;
    private final MemberMenu memberMenu;
    private final LoginMenu loginMenu;


    // Constructor --------------------------------------------
    public MenuHandler() {
        adminMenu = new AdminMenu();
        administratorMenu = new AdministratorMenu();
        bookingMenu = new BookingMenu();
        guideMenu = new GuideMenu();
        memberMenu = new MemberMenu();
        loginMenu = new LoginMenu();
    }

    // Getter -------------------------------------------------

    public AdminMenu accessAdminMenu() {
        return adminMenu;
    }

    public AdministratorMenu accessAdministratorMenu() {
        return administratorMenu;
    }

    public BookingMenu accessBookingMenu() {
        return bookingMenu;
    }

    public GuideMenu accessGuideMenu() {
        return guideMenu;
    }

    public MemberMenu accessMemberMenu() {
        return memberMenu;
    }

    public LoginMenu accessLoginMenu() {
        return loginMenu;
    }
}
