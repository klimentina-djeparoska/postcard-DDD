package postcardddd.orderpostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.domain.model.Postcard;

import java.util.List;

@Repository
public interface PostcardRepository extends JpaRepository<Postcard, String> {

    List<Postcard> findAllByUserId(String userId);
}
