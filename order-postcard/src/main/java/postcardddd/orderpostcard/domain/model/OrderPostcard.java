package postcardddd.orderpostcard.domain.model;

import postcardddd.sharedkernel.domain.base.AbstractEntity;

import lombok.Getter;
import postcardddd.sharedkernel.domain.base.DomainObjectId;
import postcardddd.sharedkernel.domain.location.Address;

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
    private Address address;
    private double price;
    private String status; // order received, made, send, delivered
    private Timestamp date;

    public OrderPostcard() {}

    public OrderPostcard(String userId, String postcardId, Address address, double price, String status, Timestamp date) {
        super(DomainObjectId.randomId(OrderPostcardId.class));
    }
}