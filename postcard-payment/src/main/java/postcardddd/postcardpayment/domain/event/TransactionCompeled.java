package postcardddd.postcardpayment.domain.event;

import postcardddd.postcardpayment.domain.repository.PostcardPaymentRepository;

public class TransactionCompeled {

    private final PostcardPaymentRepository postcardPaymentRepository;

    public TransactionCompeled(PostcardPaymentRepository postcardPaymentRepository) {
        this.postcardPaymentRepository = postcardPaymentRepository;
    }
}
