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

    public PostcardStore() {}

    public PostcardStore(@NonNull String id, String name, PhysicalAddress address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
