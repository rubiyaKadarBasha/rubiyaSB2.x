package scb.nextgen.dashboard.commons.date.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * The Class IsDateValidator.
 *
 * @author RUBIYA
 * IsDateValidator  for ConstraintValidator
 */
public class IsDateValidator implements ConstraintValidator<IsDate, String> {
	
	/**
	 * Checks if is valid.
	 *
	 * @param date the date
	 * @param context the context
	 * @return true, if is valid
	 */
	@Override
	public boolean isValid(String date, ConstraintValidatorContext context) {
		if (date == null) {
			return false;
		}
		
		try {
			DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate.parse(date, dateFmt);
		} catch (DateTimeParseException e) {
			return false;
		}
		return true;
	}

	/**
	 * Initialize.
	 *
	 * @param constraintAnnotation the constraint annotation
	 */
	@Override
	public void initialize(IsDate constraintAnnotation) {
		

	}

}
