package postcardddd.orderpostcard.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="postcard_store")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class PostcardStore {
    @Id
    String id;
    String name;
    @OneToOne
    Address location;
}
