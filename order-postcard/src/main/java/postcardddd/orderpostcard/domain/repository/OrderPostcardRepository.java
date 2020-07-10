package postcardddd.orderpostcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.domain.model.OrderPostcard;
import postcardddd.orderpostcard.domain.model.OrderPostcardId;

@Repository
public interface OrderPostcardRepository extends JpaRepository<OrderPostcard, OrderPostcardId> {
}
