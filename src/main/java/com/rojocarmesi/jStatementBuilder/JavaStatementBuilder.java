package com.rojocarmesi.jStatementBuilder;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Java Statement Builder
 *
 * Use this annotation to trigger the code generation of a fluent pojo builder.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.ANNOTATION_TYPE})
public @interface JavaStatementBuilder{
    public final String DEFAULT_NAME = "*Builder";
    public final String DEFAULT_PACKAGE = "*";
    public final String DEFAULT_SETTER_NAME = "with*";

    /**
     * Specifies the super class of the builder.
     *
     * @return the super class of the builder
     */
    Class<?> withSuperClass() default Object.class;
}
