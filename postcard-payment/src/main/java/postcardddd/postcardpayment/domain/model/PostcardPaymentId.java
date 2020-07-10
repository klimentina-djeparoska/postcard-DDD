package postcardddd.postcardpayment.domain.model;

import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class PostcardPaymentId extends DomainObjectId {

    public PostcardPaymentId() {super("");}

    public PostcardPaymentId(String id) {
        super(id);
    }

}
