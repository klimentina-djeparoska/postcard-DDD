package postcardddd.orderpostcard.domain.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
public class Image {

    @Id
    String id;
    @Column(name = "postcard_id")
    String postcardId;
    String image;


}
