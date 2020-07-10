package postcardddd.postcardpayment.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.postcardpayment.domain.model.PostcardPaymentId;

@Repository
public interface PostcardPaymentRepository extends JpaRepository<PostcardPaymentRepository, PostcardPaymentId> {
}
