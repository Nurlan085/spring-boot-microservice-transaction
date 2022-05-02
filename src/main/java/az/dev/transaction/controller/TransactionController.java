package az.dev.transaction.controller;

import az.dev.transaction.dto.request.TransactionReqDto;
import az.dev.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody TransactionReqDto transactionReqDto) {
        return new ResponseEntity<>(transactionService.saveTransaction(transactionReqDto), HttpStatus.CREATED);
    }

    @DeleteMapping("{transactionIid}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionIid) {
        transactionService.deleteTransaction(transactionIid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> findAllTransactionsByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(transactionService.findAllTransactionsByUserId(userId), HttpStatus.OK);
    }

}
