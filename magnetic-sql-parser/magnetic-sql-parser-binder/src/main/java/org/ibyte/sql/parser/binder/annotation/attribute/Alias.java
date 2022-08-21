package org.ibyte.sql.parser.binder.annotation.attribute;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.PACKAGE;

/**
 * 别名标识
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE})
public @interface Alias {

    /**
     * 别名标注
     */
    String value();
}

