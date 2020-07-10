package postcardddd.orderpostcard.domain.model;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import postcardddd.orderpostcard.domain.repository.ImageRepository;
import postcardddd.orderpostcard.domain.repository.PostcardRepository;

import javax.persistence.Id;
import java.util.LinkedList;

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
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private PostcardRepository postcardRepository;

    public PostcardType() { }

    public PostcardType(@NonNull String typeName, Integer width, Integer height, Integer numOfImages, String position) {
        this.typeName = typeName;
        this.width = width;
        this.height = height;
        this.numOfImages = numOfImages;
        this.position = position;
    }

    public boolean checkPostcardTypeCorrectness(OrderPostcard orderPostcard) {

        LinkedList<Image> images = this.imageRepository.findImagesByPostcardId(orderPostcard.getPostcardId());
        Postcard postcard = this.postcardRepository.findById(orderPostcard.getPostcardId()).orElseThrow(RuntimeException::new);
        switch (postcard.getType()) {
            case "portrait":
                if (images.size() != 1) return false;
                break;
            case "duo-pack":
                if (images.size() != 2) return false;
                break;
            case "trio-pack":
                if (images.size() != 3) return false;
                break;
            default: return true;
        }
        return true;
    }

}
