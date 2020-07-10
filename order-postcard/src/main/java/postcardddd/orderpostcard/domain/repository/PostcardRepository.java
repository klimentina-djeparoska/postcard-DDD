package postcardddd.orderpostcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.domain.model.Postcard;

@Repository
public interface PostcardRepository extends JpaRepository<Postcard, String> {
}
