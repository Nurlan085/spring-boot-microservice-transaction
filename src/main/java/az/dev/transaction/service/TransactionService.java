package az.dev.transaction.service;

import az.dev.transaction.dto.request.TransactionReqDto;
import az.dev.transaction.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(TransactionReqDto transactionReqDto);
    void deleteTransaction(Long transactionId);
    List<Transaction> findAllTransactionsByUserId(Long userId);
}
