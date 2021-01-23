package jp.JpFinance.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jp.JpFinance.dbModel.Budget;
import jp.JpFinance.dbModel.IncomExpenses;
import jp.JpFinance.service.IncomeExpensesService;

@RestController
@RequestMapping("/incomexpenses/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class IncomExpensesController {

	
	@Autowired
	IncomeExpensesService incomExpenses;

	@PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> save(HttpServletRequest request, @RequestBody IncomExpenses inEx) {
		try {
			incomExpenses.save(inEx);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> update(HttpServletRequest request, @RequestBody IncomExpenses inEx) {
		try {
			incomExpenses.update(inEx);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(value = "delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> delete(HttpServletRequest request, @RequestBody IncomExpenses inEx) {
		try {
			incomExpenses.delete(inEx);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<IncomExpenses>> getAll(HttpServletRequest request) {

		try {
			List<IncomExpenses> listPerson = incomExpenses.getAll();
			return new ResponseEntity<>(listPerson, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
	
	@PostMapping(value = "calculateValue", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Budget> calculateValue(HttpServletRequest request, @RequestBody Budget budget) {
		try {
			Budget budg = incomExpenses.calculateValue(budget);
			return new ResponseEntity<>(budg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
}
