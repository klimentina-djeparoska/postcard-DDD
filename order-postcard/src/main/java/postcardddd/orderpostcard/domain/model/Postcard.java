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

    public Postcard() {};

    public Postcard(@NonNull String id, String userId, String type, String message, String font) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.message = message;
        this.font = font;
    }

}
