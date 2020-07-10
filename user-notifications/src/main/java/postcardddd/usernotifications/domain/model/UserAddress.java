package postcardddd.usernotifications.domain.model;

import org.springframework.lang.NonNull;
import postcardddd.sharedkernel.domain.location.Address;

public class UserAddress extends Address {

    public UserAddress() {super("", "", "", "", 0);}

    public UserAddress(@NonNull String id, String street, String city, String country, Integer postalCode) {
        super(id, street, city, country, postalCode);
    }
}
