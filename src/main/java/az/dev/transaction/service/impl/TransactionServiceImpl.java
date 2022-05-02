package az.dev.transaction.service.impl;

import az.dev.transaction.dto.request.TransactionReqDto;
import az.dev.transaction.model.Transaction;
import az.dev.transaction.repository.TransactionRepository;
import az.dev.transaction.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    @Override
    public Transaction saveTransaction(TransactionReqDto transactionReqDto) {
        Transaction transaction = Transaction.builder()
                .userId(transactionReqDto.getUserId())
                .productId(transactionReqDto.getProductId())
                .transactionTime(LocalDateTime.now())
                .build();
        return transactionRepository.save(transaction);
    }

    @Override
    public void deleteTransaction(Long transactionId) {
        transactionRepository.deleteById(transactionId);
    }

    @Override
    public List<Transaction> findAllTransactionsByUserId(Long userId) {
        return transactionRepository.findAllByUserId(userId);
    }
}
