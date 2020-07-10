package postcardddd.orderpostcard.domain.model;

import org.springframework.lang.NonNull;
import postcardddd.sharedkernel.domain.location.Address;

public class PhysicalAddress extends Address {

    public PhysicalAddress() {super("", "", "", "", 0);}

    public PhysicalAddress(@NonNull String id, String street, String city, String country, Integer postalCode) {
        super(id, street, city, country, postalCode);
    }
}
