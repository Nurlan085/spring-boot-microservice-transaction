package az.dev.transaction.dto.request;

import lombok.Data;

@Data
public class TransactionReqDto {

    private Long userId;
    private Long productId;
}
