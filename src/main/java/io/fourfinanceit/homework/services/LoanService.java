package io.fourfinanceit.homework.services;

import io.fourfinanceit.homework.beans.Loan;
import io.fourfinanceit.homework.dal.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by azee on 25.04.16.
 */
@Service
public class LoanService {
    LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan findOne(Long id){
        return loanRepository.findById(id);
    }

    public Loan save(Loan loan){
        return loanRepository.save(loan);
    }

    public void delete(Long id){
        loanRepository.delete(id);
    }
}
