package org.ibyte.sql.parser.binder.annotation;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * 标记不允许为空标识
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(value = {TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
public @interface NullUnable {
}
