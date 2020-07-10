package postcardddd.orderpostcard.service;

import postcardddd.orderpostcard.domain.model.PostcardType;

import java.util.List;
import java.util.Optional;

public interface PostcardTypeService {

    public Optional<List<PostcardType>> getAll();

    PostcardType savePostcardType(String name, Integer width, Integer height, Integer numOfImages, String position);

    List<PostcardType> getAllPostcardTypes();

    Optional<PostcardType> getPostcardType(String name);

    void deleteByName(String name);
}
