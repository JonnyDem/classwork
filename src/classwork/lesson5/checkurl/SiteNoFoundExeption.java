package classwork.lesson5.checkurl;

import java.io.PrintStream;

public class SiteNoFoundExeption extends  Exception{

    @Override
    public void printStackTrace() {
        System.out.println("Site wasn't found");
    }
}
