package postcardddd.orderpostcard.domain.model;

import lombok.NonNull;
import postcardddd.sharedkernel.domain.base.DomainObjectId;

public class OrderPostcardId extends DomainObjectId {

    private OrderPostcardId () {
        super("");
    }

    public OrderPostcardId(@NonNull String id) {
        super(id);
    }
}
