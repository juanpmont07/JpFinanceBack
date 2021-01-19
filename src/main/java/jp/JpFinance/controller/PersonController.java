package jp.JpFinance.controller;

import jp.JpFinance.model.Person;
import jp.JpFinance.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/person/")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class PersonController {
    @Autowired
    PersonService personService;

    @PostMapping(value = "save", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> save(HttpServletRequest request,
                                        @RequestBody Person person) {
        try {
            personService.save(person);
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping(value = "update", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> update(HttpServletRequest request,
                                             @RequestBody Person person) {
        try {
            personService.update(person);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PostMapping(value = "delete", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> delete(HttpServletRequest request,
                                             @RequestBody Person person) {
        try {
            personService.delete(person);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "getPerson", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getPerson(HttpServletRequest request,
                                            @RequestParam("ID") String ID) {

        try {
            Person person = personService.getPerson(ID);
            return new ResponseEntity<>(person, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Person>> getAll(HttpServletRequest request) {

        try {
            List<Person> listPerson = personService.getAll();
            return new ResponseEntity<>(listPerson, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }


}
