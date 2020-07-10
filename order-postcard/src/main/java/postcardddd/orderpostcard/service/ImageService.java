package postcardddd.orderpostcard.service;

import postcardddd.orderpostcard.model.Image;

import java.util.List;

public interface ImageService {

    List<Image> getAllImagesForPostcard(String postcardId);

    Image saveImage(String id, String user_uid, String image);

    Image getImageById(String id);
}
