package postcardddd.orderpostcard.domain.model;

import postcardddd.sharedkernel.domain.location.Address;

public class DestinationAddress extends Address {

    private String receiverName;

    public DestinationAddress() {super("","","","",0);}

    public DestinationAddress(String receiverName, String id, String street, String city, String country, Integer postalCode) {
        super(id, street, city, country, postalCode);
        this.receiverName = receiverName;
    }
}
