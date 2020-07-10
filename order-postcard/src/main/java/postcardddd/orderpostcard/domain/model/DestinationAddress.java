package postcardddd.orderpostcard.domain.model;

import postcardddd.sharedkernel.domain.location.Address;

public class DestinationAddress extends Address {


    public DestinationAddress() {super("","","","",0);}

    public DestinationAddress(String id, String street, String city, String country, Integer postalCode) {
        super(id, street, city, country, postalCode);
    }
}
