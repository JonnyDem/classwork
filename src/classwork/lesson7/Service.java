package classwork.lesson7;


import classwork.lesson7.testanotation.MyAnatation;

import java.lang.reflect.Method;
@RemindMe(reason = "just", where = "Kiev")
@Default(team = "Arsenal Kiev")
@MyAnatation
public class Service {


    public static void main(String[] args) throws NoSuchMethodException {
        //new Service().print();
        new Service().read();

        try {
            new Service().eat();
            new Service().drink();
        } catch (DoNotAllowPrintExeption doNotAllowPrintExeption) {
            doNotAllowPrintExeption.printStackTrace();
        }
    }

    //@CodingTime
    public void print() throws NoSuchMethodException {
        Class<? extends Service> aClass = getClass();
        Method print = aClass.getMethod("print");
        System.out.println(print.isAnnotationPresent(CodingTime.class));


    }

    /**
     * @throws NoSuchMethodException
     */
    @Default(team = "Dynamo Kiev")
    public void read() throws NoSuchMethodException {
        Class<? extends Service> aClass = getClass();
        Method read2 = aClass.getMethod("read");
       Default annotation2 = aClass.getAnnotation(Default.class);
        Default annotation = read2.getAnnotation(Default.class);
        System.out.println(annotation.team());
        System.out.println(annotation.city());
        System.out.println(annotation2.team());
    }

    @AllowPrint
    public void eat() throws NoSuchMethodException, DoNotAllowPrintExeption {
        Class<? extends Service> aClass = getClass();
        Method eat = aClass.getMethod("eat");
        if (eat.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("eat");
        } else {
            throw new DoNotAllowPrintExeption();
        }
    }

    public void drink() throws NoSuchMethodException, DoNotAllowPrintExeption {
        Class<? extends Service> aClass = getClass();
        Method drink = aClass.getMethod("drink");
        if (drink.isAnnotationPresent(AllowPrint.class)) {
            System.out.println("drink");
        } else {
           throw new DoNotAllowPrintExeption();
        }
    }
}
