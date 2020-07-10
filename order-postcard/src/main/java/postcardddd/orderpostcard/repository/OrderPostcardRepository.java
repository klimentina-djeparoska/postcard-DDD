package postcardddd.orderpostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postcardddd.orderpostcard.model.OrderPostcard;

import java.util.List;

@Repository
public interface OrderPostcardRepository extends JpaRepository<OrderPostcard, String> {

    List<OrderPostcard> findAllByCountry(String country);

    List<OrderPostcard> findAllByCity(String city);

    List<OrderPostcard> findAllByUserId(String userId);


}
