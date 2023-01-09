package handler_test;

import handlers.MenuHandler;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/*
 * Since we are talking about inheritance there won't be
 * a necessary need for testing ALL the different menus.
 * We will though be testing a few of each menu
 */

public class TestMenuHandler {
    MenuHandler testMenuHandler = new MenuHandler();

    @Test
    @DisplayName("Test AdministratorMenu is not null")
    public void testAdministratorMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessAdministratorMenu().getAdministratorHeadMenu());
    } // End of method

    @Test
    @DisplayName("Test Administrator Sub Menu is not null")
    public void testAdministratorSubMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessAdministratorMenu().getChangeMemberMenu());
    } // End of method

    @Test
    @DisplayName("Test AdminMenu is not null")
    public void testAdminMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessAdminMenu().getAdminMenu());
    } // End of method

    @Test
    @DisplayName("Test Admin Sub Menu is not null")
    public void testAdminSubMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessAdminMenu().getAdminUserChangeMenu());
    } // End of method

    @Test
    @DisplayName("Test BookingMenu is not null")
    public void testBookingMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessBookingMenu().getBookingMenu());
    } // End of method

    @Test
    @DisplayName("Test GuideMenu is not null")
    public void testGuideMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessGuideMenu().getGuideMenu());
    } // End of method

    @Test
    @DisplayName("Test LoginMenu is not null")
    public void testLoginMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessLoginMenu().getLoginMenu());
    } // End of method

    @Test
    @DisplayName("Test Login Sub Menu is not null")
    public void testLoginSubMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessLoginMenu().getChangePasswordMenu());
    } // End of method

    @Test
    @DisplayName("Test MemberMenu is not null")
    public void testMemberMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessMemberMenu().getMemberMenu());
    } // End of method

    @Test
    @DisplayName("Test Member Sub Menu is not null")
    public void testMemberSubMenuIsNotNull() {
        assertNotNull(testMenuHandler.accessMemberMenu().getMemberProfileMenu());
    } // End of method

}