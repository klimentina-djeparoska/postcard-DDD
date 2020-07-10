package postcardddd.orderpostcard.domain.model;
import lombok.*;

import javax.persistence.Id;

@Getter
@Setter
@Data
public class PostcardType {

    @Id
    private String typeName;
    private Integer width;
    private Integer height;
    private Integer numOfImages;
    private String position;

    public PostcardType() { }

    public PostcardType(String typeName, Integer width, Integer height, Integer numOfImages, String position) {
        this.typeName = typeName;
        this.width = width;
        this.height = height;
        this.numOfImages = numOfImages;
        this.position = position;
    }

}
