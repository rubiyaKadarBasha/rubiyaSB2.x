package scb.nextgen.dashboard.commons.date.util;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Payload;

import javax.validation.Constraint;


/**
 * The Interface IsDate.
 *
 * @author RUBIYA
 * Validate The ISO Date 
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = IsDateValidator.class)
public @interface IsDate {
	  
  	/**
  	 * Message.
  	 *
  	 * @return the string
  	 */
  	String message() default "Date is empty or not valid YYYY-MM-DD.";
	  
  	/**
  	 * Groups.
  	 *
  	 * @return the class[]
  	 */
  	Class<?>[] groups() default {};
	  
  	/**
  	 * Payload.
  	 *
  	 * @return the class<? extends payload>[]
  	 */
  	Class<? extends Payload>[] payload() default {};
}
