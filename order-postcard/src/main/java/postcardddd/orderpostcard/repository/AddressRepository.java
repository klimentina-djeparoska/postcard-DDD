package postcardddd.orderpostcard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postcardddd.orderpostcard.domain.model.Address;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, String> {
    List<Address> findAllByUserId(String userId);
}
