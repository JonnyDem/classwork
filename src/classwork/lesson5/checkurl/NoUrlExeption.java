package classwork.lesson5.checkurl;

import java.io.PrintStream;

public class NoUrlExeption extends Exception {

    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("No url");
    }
}
