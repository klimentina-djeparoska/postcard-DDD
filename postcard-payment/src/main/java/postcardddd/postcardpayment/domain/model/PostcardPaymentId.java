package postcardddd.postcardpayment.domain.model;

import org.springframework.lang.NonNull;
import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class PostcardPaymentId extends DomainObjectId {

    public PostcardPaymentId() {super("");}

    public PostcardPaymentId(@NonNull String id) {
        super(id);
    }

}
