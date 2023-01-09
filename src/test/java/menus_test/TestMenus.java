package menus_test;

import handlers.MenuHandler;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;


/*
 * Since we are talking about inheritance there won't be
 * a necessary need for testing ALL the different menus.
 * We will though be testing a few of each menu
 */

public class TestMenus {

    MenuHandler menuHandler = new MenuHandler();

    @Test
    @DisplayName("Test Administrator Menu Options are not empty")
    public void testAdministratorMenuOptions() {
        for (int i = 0; i < menuHandler.accessAdministratorMenu().getAdministratorHeadMenu().getMenuOptions().length; i++) {
            assertNotSame("",menuHandler.accessAdministratorMenu().getAdministratorHeadMenu().getMenuOptions()[i]);
            System.out.println(menuHandler.accessAdministratorMenu().getAdministratorHeadMenu().getMenuOptions()[i]);
        } // End of method
    } // End of test method


    @Test
    @DisplayName("Test AdminMenu Options are not empty")
    public void testAdminMenuOptions() {
        for (int i = 0; i < menuHandler.accessAdminMenu().getAdminMenu().getMenuOptions().length; i++) {
            assertNotSame("",menuHandler.accessAdminMenu().getAdminMenu().getMenuOptions()[i]);
            System.out.println(menuHandler.accessAdminMenu().getAdminMenu().getMenuOptions()[i]);
        } // End of method
    } // End of test method


    @Test
    @DisplayName("Test Sub-AdminMenu Options are not empty")
    public void testSubAdminMenuOptions() {
        for (int i = 0; i < menuHandler.accessAdminMenu().getAdminUserChangeMenu().getMenuOptions().length; i++) {
            assertNotSame("",menuHandler.accessAdminMenu().getAdminUserChangeMenu().getMenuOptions()[i]);
            System.out.println(menuHandler.accessAdminMenu().getAdminUserChangeMenu().getMenuOptions()[i]);
        } // End of method
    } // End of test method
}
