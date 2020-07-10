package postcardddd.orderpostcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.domain.model.Image;

import java.util.LinkedList;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {

    public LinkedList<Image> findImagesByPostcardId(String postcardIs);
}
