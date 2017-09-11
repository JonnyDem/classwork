package classwork.lesson5.checkurl;

import java.io.PrintStream;

public class NoUrlExeption extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("No url");
    }
}
