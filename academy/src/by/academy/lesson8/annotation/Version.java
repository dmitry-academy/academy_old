package by.academy.lesson8.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD })
@Inherited
public @interface Version {

	String info();

	int minArgs() default 0;

	String[] aliases() default {};
}
