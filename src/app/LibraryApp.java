package app;

import data.Library;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "LibraryApp v0.7(beta)";
        System.out.println(appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
    }
}
