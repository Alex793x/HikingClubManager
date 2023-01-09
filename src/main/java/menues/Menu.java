package menues;

import utilities.menu_print.MenuPrint;

import java.util.Scanner;

public abstract class Menu {

    // Attributes --------------------------
    private final String[] menuOptions;
    private final String leadText;
    private final String menuHeader;


    // Constructor -------------------------
    protected Menu(String menuHeader, String leadText, String[] menuOptions) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuOptions = menuOptions;
    } // End of method

    // This constructor is mainly only for MenuHandler to create instances of the menus.
    protected Menu() {
        this.menuHeader = "";
        this.leadText = "";
        this.menuOptions = new String[] {""};
    } // End of method

    // Getter ----------------------------------------------------
    public String[] getMenuOptions() {
        return menuOptions;
    }



    // Print MenuOption Method ------------------------------------
    protected void printMenu(MenuPrint print) {
        print.printMenuAttribute(menuHeader);

        for (String options : menuOptions) {
            print.printMenuAttribute(options);
        } // End of for loop

        print.printMenuAttribute(leadText);
    } // End of method

    private void menuLoop(MenuPrint print) {
        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu(print);

            switch (in.nextInt()) {
                case 1 -> {}
                case 2 -> {}
                default -> {
                    return;
                } // End of default case
            } // End of switch case
        } // ENd of while loop
    } // End of method
}
