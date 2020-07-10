package postcardddd.orderpostcard.repository;

import postcardddd.orderpostcard.domain.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {

    List<Image> findAllByPostcardId(String postcardId);
}
