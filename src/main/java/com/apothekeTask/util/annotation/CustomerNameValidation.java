package com.apothekeTask.util.annotation;


import com.apothekeTask.util.constant.ValidationConstant;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

@Target({FIELD, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = com.apothekeTask.util.annotation.CustomerNameValidator.class)
public @interface CustomerNameValidation {

    //error message
    public String message() default ValidationConstant.CUSTOMER_NAME_INVALID;

    //represents group of constraints
    public Class<?>[] groups() default {};

    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
