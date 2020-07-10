package postcardddd.orderpostcard.domain.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
public class Postcard {

    @Id
    private String id;
    @Column(name = "user_id")
    private String userId;
    private String type;
    private String message;
    private String font;

}
