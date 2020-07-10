package postcardddd.orderpostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.model.PostcardStore;

@Repository
public interface PostcardStoreRepository extends JpaRepository<PostcardStore, String> {
}
