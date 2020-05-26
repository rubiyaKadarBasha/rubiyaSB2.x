package scb.nextgen.dashboard.securitymultifactor.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * The Class SecurityMultifactorApplication.
 *
 * @author RUBIYA
 */
@SpringBootApplication
public class SecurityMultifactorApplication {
	 private final static Logger log = LoggerFactory.getLogger(SecurityMultifactorApplication.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SecurityMultifactorApplication.class, args);
		 log.debug("SecurityMultifactorApplication Is Started !!!!");
	}



}