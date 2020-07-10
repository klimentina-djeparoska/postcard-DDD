package postcardddd.orderpostcard.service;

import postcardddd.orderpostcard.model.Postcard;

import java.util.List;

public interface PostcardService {

    Postcard savePostcard(String id, String user_id, String type, String message, String font);

    List<Postcard> getAllPostcards(String user_id);

    Postcard getPostcard(String id);

    void deleteById(String id);
}
