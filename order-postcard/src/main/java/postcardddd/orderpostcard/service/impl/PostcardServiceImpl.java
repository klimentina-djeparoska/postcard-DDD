package postcardddd.orderpostcard.service.impl;

import org.springframework.stereotype.Service;
import postcardddd.orderpostcard.domain.model.Postcard;
import postcardddd.orderpostcard.domain.model.PostcardType;
import postcardddd.orderpostcard.domain.model.exceptions.InvalidPostcardNotFoundException;
import postcardddd.orderpostcard.domain.model.exceptions.InvalidPostcardTypeNotFoundException;
import postcardddd.orderpostcard.repository.PostcardRepository;
import postcardddd.orderpostcard.repository.PostcardTypeRepository;
import postcardddd.orderpostcard.service.PostcardService;

import java.util.List;

@Service
public class PostcardServiceImpl implements PostcardService {

    private final PostcardRepository postcardRepository;
    private final PostcardTypeRepository postcardTypeRepository;

    public PostcardServiceImpl(PostcardRepository postcardRepository, PostcardTypeRepository postcardTypeRepository) {
        this.postcardRepository = postcardRepository;
        this.postcardTypeRepository = postcardTypeRepository;
    }

    @Override
    public Postcard savePostcard(String id, String user_id, String type, String message, String font) {

        if (id == null || user_id == null || type == null) {
            throw new IllegalArgumentException();
        }

        //check if type exists
        PostcardType postcardType = this.postcardTypeRepository.findById(type).orElseThrow(InvalidPostcardTypeNotFoundException::new);

        Postcard postcard = new Postcard(id, user_id, postcardType.getName(), message, font);
        return this.postcardRepository.save(postcard);
    }

    @Override
    public List<Postcard> getAllPostcards(String user_id) {
        return this.postcardRepository.findAllByUserId(user_id);
    }

    @Override
    public Postcard getPostcard(String id) {
        return this.postcardRepository.findById(id).orElseThrow(InvalidPostcardNotFoundException::new);
    }

    @Override
    public void deleteById(String id) {
        this.postcardRepository.deleteById(id);
    }
}
