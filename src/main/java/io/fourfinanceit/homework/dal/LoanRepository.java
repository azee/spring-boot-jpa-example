package io.fourfinanceit.homework.dal;

import io.fourfinanceit.homework.beans.Loan;
import org.springframework.data.repository.Repository;

/**
 * Created by azee on 25.04.16.
 */
public interface LoanRepository extends Repository<Loan, Long> {
    public Loan findById(Long id);
    public Loan save(Loan loan);
    public Loan delete(Long id);
}
