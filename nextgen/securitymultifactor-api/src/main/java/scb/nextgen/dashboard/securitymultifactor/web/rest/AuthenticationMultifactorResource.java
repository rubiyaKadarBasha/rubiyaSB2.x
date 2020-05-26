package scb.nextgen.dashboard.securitymultifactor.web.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import scb.nextgen.dashboard.securitymultifactor.dto.AuthenticationSummary;
import scb.nextgen.dashboard.securitymultifactor.dto.Success;

@RestController

public class AuthenticationMultifactorResource {
	private final Logger log = LoggerFactory.getLogger(AuthenticationMultifactorResource.class);

	@RequestMapping("/")
	public ResponseEntity<?> authenticationService() {

		AuthenticationSummary summary = new AuthenticationSummary();
		Success multifactorResponse = new Success();
		multifactorResponse.setMessage("Sample Response");
		summary.setMultifactorResponse(multifactorResponse);
		log.debug("AuthenticationSummary: {}", summary);

		return new ResponseEntity<>(summary, HttpStatus.OK);

	}
}