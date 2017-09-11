package classwork.lesson7.testanotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.reflect.Method;


@MyAnatation
public class MyClass {
    public static void main(String[] args)  {
        try {
            new MyClass().print();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

@SuppressWarnings("not met")
public void print() throws NoSuchMethodException {
    Class<? extends MyClass> aClass = getClass();

    Method print = aClass.getMethod("print");
    System.out.println(print.isAnnotationPresent(SuppressWarnings.class));
    System.out.println(print.getAnnotation(SuppressWarnings.class));
    System.out.println(aClass.getAnnotation(MyAnatation.class));
}

public void read(){

}
}
