package postcardddd.orderpostcard.domain.model;

import lombok.NonNull;
import postcardddd.sharedkernel.domain.base.AbstractEntity;

import lombok.Getter;
import postcardddd.sharedkernel.domain.base.DomainObjectId;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order_postcard")
@Getter
public class OrderPostcard  extends AbstractEntity<OrderPostcardId>{

    @Column(name = "user_id")
    private String userId;
    @Column(name = "postcard_id")
    private String postcardId;
    @Column(name = "destination_address")
    @OneToMany
    private DestinationAddress address;
    private double price;
    private OrderStatus status;
    private PostcardStore store;
    private Timestamp date;

    public OrderPostcard() {}

    public OrderPostcard(@NonNull String userId, String postcardId, DestinationAddress address, double price, OrderStatus status, PostcardStore store, Timestamp date) {
        super(DomainObjectId.randomId(OrderPostcardId.class));
    }
}
