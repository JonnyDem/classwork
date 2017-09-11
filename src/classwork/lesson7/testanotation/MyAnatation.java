package classwork.lesson7.testanotation;

import java.lang.annotation.*;
@Documented
//@Target({ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnatation {
    String name() default "Kiev";
}
