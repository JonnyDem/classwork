package classwork.lesson5.checkurl;

import java.io.PrintStream;

public class NoProtocolExeption extends Exception{
    @Override
    public void printStackTrace(PrintStream s) {
        System.err.println("No protocol");
    }
}
