package controllers;

import handlers.FileHandler;

/*
 * This class represents a controller, to control any flow going
 * in or out of file handling and how they are used within the application.
 */
public class FileController {
    // Attributes ------------------------------
    private final FileHandler fileHandler;

    // Constructor -----------------------------
    public FileController() {
        fileHandler = new FileHandler();
    }

    // Getter ---------------------------------
    public FileHandler getFileHandler() {
        return fileHandler;
    }
}
