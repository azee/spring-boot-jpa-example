package io.fourfinanceit.homework.controller;

import io.fourfinanceit.homework.beans.Loan;
import io.fourfinanceit.homework.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by azee on 25.04.16.
 */
@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @RequestMapping("/{id}")
    @ResponseBody
    public Loan getLoan(@PathVariable("id") long id){
        return loanService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE}
    )

    @ResponseBody
    public Loan createLoan(@RequestBody Loan loan){
        return loanService.save(loan);
    }

    @RequestMapping(method = RequestMethod.PUT,
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_UTF8_VALUE}
    )
    @ResponseBody
    public Loan updateLoan(@RequestBody Loan loan){
        return loanService.save(loan);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") long id){
        loanService.delete(id);
    }
}
