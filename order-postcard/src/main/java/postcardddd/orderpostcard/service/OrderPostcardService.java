package postcardddd.orderpostcard.service;

import postcardddd.orderpostcard.model.Address;
import postcardddd.orderpostcard.model.OrderPostcard;

import java.sql.Timestamp;
import java.util.List;

public interface OrderPostcardService {
    OrderPostcard saveOrder(String id, String user_id, String postcard, Address address, double price, String status, Timestamp date);

    List<OrderPostcard> getAllOrdersForUser(String user_id);

    List<OrderPostcard> getAllOrdersForCountry(String country);

    List<OrderPostcard> getAllOrdersForCity(String city);

    OrderPostcard getOrder(String id);

    void deleteById(String id);

    void changeOrderStatus(String id, String status);

}
