package postcardddd.postcardpayment.domain.model;

import postcardddd.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
public class PostcardPayment extends AbstractEntity<PostcardPaymentId>{

    private double price;
    private PaymentMethod paymentMethod;
    private Timestamp timestamp;

    public PostcardPayment () {}

    public PostcardPayment(double price, PaymentMethod paymentMethod, Timestamp timestamp) {
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.timestamp = timestamp;
    }
}
