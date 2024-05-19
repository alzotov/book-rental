package com.azotov.bookrental;

import com.azotov.bookrental.Borrower;
import com.azotov.bookrental.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrowers")
public class BorrowerController {
    @Autowired
    private BorrowerService borrowerService;

    @PostMapping
    public Borrower registerBorrower(@RequestBody Borrower borrower) {
        return borrowerService.registerBorrower(borrower);
    }
}
