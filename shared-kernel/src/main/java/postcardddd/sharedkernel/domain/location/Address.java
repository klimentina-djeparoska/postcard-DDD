package postcardddd.sharedkernel.domain.location;

import postcardddd.sharedkernel.domain.base.ValueObject;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Address implements ValueObject {
    @Id
    private String id;
    private String street;
    private String city;
    private String country;
    @Column(name="postal_code")
    private Integer postalCode;

    public Address() {}

    public Address(String id, String street, String city, String country, Integer postalCode) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Integer getPostalCode() {
        return postalCode;
    }
}
