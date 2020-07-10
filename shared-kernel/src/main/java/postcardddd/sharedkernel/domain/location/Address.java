package postcardddd.sharedkernel.domain.location;

import postcardddd.sharedkernel.domain.base.ValueObject;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Address implements ValueObject {
    @Id
    private String id;
    @Column(name="user_id")
    private String street;
    private String city;
    private String country;
    @Column(name="postal_code")
    private Integer postalCode;
}
