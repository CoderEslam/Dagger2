package com.doubleclick.dagger2;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

/**
 * Created By Eslam Ghazy on 8/25/2022
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface Sugar {
    /**
     * The name.
     */
    String value() default "sugar";
}
