package example;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MetaData {
    String value() default "-";
	int number() default 50;
}
