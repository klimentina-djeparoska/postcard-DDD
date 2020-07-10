package postcardddd.orderpostcard.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postcardddd.sharedkernel.domain.location.Address;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, String> {
    List<Address> findAllByUserId(String userId);
}
