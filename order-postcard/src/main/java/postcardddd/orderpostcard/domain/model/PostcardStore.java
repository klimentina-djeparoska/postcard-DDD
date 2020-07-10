package postcardddd.orderpostcard.domain.model;

import lombok.*;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@Data
public class PostcardStore {
    @Id
    String id;
    String name;
    @OneToOne
    PhysicalAddress address;
}
