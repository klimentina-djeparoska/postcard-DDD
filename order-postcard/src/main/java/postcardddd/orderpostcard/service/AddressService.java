package postcardddd.orderpostcard.service;


import postcardddd.orderpostcard.domain.model.Address;
import java.util.List;

public interface AddressService {

    Address saveAddress(String id, String userId, String street, String city, String country, Integer postalCode);

    Address updateAddress(String id, String userId, String street, String city, String country, Integer postalCode);

    Address getAddress(String id);

    void deleteAddress(String id);

    List<Address> getAllAddressesForUser(String userId);

}
