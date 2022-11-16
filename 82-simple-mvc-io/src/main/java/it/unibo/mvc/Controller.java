package it.unibo.mvc;

import java.io.File;

/**
 * Application controller. Performs the I/O.
 */
public class Controller {

    private static final String HOME = System.getProperty("user.home");
    private static final String DEFAULT_FILE = "output.txt";

    File input = new File(HOME + File.separator + DEFAULT_FILE);
    
    public File getFile() {
        return input;
    }

    public String getPath(File input) {
        return input.getPath();
    }
}
