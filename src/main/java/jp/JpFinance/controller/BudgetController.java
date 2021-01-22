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
import jp.JpFinance.service.BudgetService;

@RestController
@RequestMapping("/budget/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class BudgetController {

	
	@Autowired
	BudgetService budgetService;

	@PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> save(HttpServletRequest request, @RequestBody Budget bud) {
		try {
			budgetService.save(bud);
			return new ResponseEntity<>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> update(HttpServletRequest request, @RequestBody Budget bud) {
		try {
			budgetService.update(bud);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@PostMapping(value = "delete", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> delete(HttpServletRequest request, @RequestBody Budget bud) {
		try {
			budgetService.delete(bud);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Budget>> getAll(HttpServletRequest request) {

		try {
			List<Budget> listPerson = budgetService.getAll();
			return new ResponseEntity<>(listPerson, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

	}
	
}
