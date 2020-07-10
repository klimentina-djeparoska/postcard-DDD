package postcardddd.orderpostcard.model;


import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "orderitem")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class OrderPostcard {

    @Id
    private String id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "postcard_id")
    private String postcardId;
    @OneToMany
    private Address address;
    private double price;
    private String status; // order received, made, send, delivered
    private Timestamp date;
}
