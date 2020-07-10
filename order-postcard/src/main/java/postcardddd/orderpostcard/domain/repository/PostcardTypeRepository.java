package postcardddd.orderpostcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.domain.model.PostcardType;

@Repository
public interface PostcardTypeRepository extends JpaRepository<PostcardType, String> {
}
