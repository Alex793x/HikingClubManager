package controllers;

import handlers.DestinationHandler;

/*
 *  This class represent a controller to direct the flow in and out
 * of Destination class, and how it is used within this application.
 */
public class DestinationController {

    // Attributes -----------------------------
    private final DestinationHandler destinationHandler;

    // Constructor ----------------------------
    public DestinationController() {
        destinationHandler = new DestinationHandler();
    } // End of method


    // Getter -----------------------------------
    public DestinationHandler getDestinationHandler() {
        return destinationHandler;
    }
}
