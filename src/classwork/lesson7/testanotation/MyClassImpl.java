package classwork.lesson7.testanotation;

import java.lang.annotation.Inherited;


public class MyClassImpl extends MyClass {


    @Override

    public void print() throws NoSuchMethodException {
        super.print();
    }

    @Override
    public void read() {
        super.read();
    }
}
