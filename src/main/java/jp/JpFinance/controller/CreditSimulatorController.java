package jp.JpFinance.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.JpFinance.model.CreditSimulator;
import jp.JpFinance.service.CreditSimulatorService;

@RestController
@RequestMapping("/creditSimulator/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class CreditSimulatorController {
	
	@Autowired
	CreditSimulatorService creditSimulator;
	
	@PostMapping(value = "simulate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CreditSimulator> simulate(HttpServletRequest request, @RequestBody CreditSimulator creditSim) {
		try {
			return new ResponseEntity<>(creditSimulator.calculateQuotas(creditSim) , HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

}
