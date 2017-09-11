package classwork.lesson7;

public class DoNotAllowPrintExeption extends Exception{

    @Override
    public void printStackTrace() {
        System.err.println("Can't print");
    }
}
