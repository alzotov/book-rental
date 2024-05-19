package com.azotov.bookrental;

import com.azotov.bookrental.Borrower;
import com.azotov.bookrental.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowerService {
    @Autowired
    private BorrowerRepository borrowerRepository;

    public Borrower registerBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }
}
