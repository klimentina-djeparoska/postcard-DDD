package postcardddd.orderpostcard.service.impl;

import org.springframework.stereotype.Service;
import postcardddd.orderpostcard.domain.model.Address;
import postcardddd.orderpostcard.domain.model.OrderPostcard;
import postcardddd.orderpostcard.domain.model.Postcard;
import postcardddd.orderpostcard.domain.model.exceptions.InvalidOrderNotFoundException;
import postcardddd.orderpostcard.domain.model.exceptions.InvalidPostcardNotFoundException;
import postcardddd.orderpostcard.repository.OrderPostcardRepository;
import postcardddd.orderpostcard.repository.PostcardRepository;
import postcardddd.orderpostcard.service.OrderPostcardService;

import java.sql.Timestamp;
import java.util.List;

@Service
public class OrderPostcardServiceImpl implements OrderPostcardService {

    private final OrderPostcardRepository orderPostcardRepository;
    private final PostcardRepository postcardRepository;

    public OrderPostcardServiceImpl(OrderPostcardRepository orderPostcardRepository, PostcardRepository postcardRepository) {
        this.orderPostcardRepository = orderPostcardRepository;
        this.postcardRepository = postcardRepository;
    }
    @Override
    public OrderPostcard saveOrder(String id, String user_id, String postcard_id, Address address, double price, String status, Timestamp date) {

        if (id == null || user_id == null || postcard_id == null) {
            throw new IllegalArgumentException();
        }

        //check if postcard exists
        Postcard postcard = this.postcardRepository.findById(postcard_id).orElseThrow(InvalidPostcardNotFoundException::new);

        OrderPostcard orderPostcard = new OrderPostcard(id, user_id, postcard.getId(), address, price, status, date);
        return this.orderPostcardRepository.save(orderPostcard);
    }

    @Override
    public List<OrderPostcard> getAllOrdersForUser(String user_id) {
        return this.orderPostcardRepository.findAllByUserId(user_id);
    }

    @Override
    public List<OrderPostcard> getAllOrdersForCountry(String country) {
        return this.orderPostcardRepository.findAllByCountry(country);
    }

    @Override
    public List<OrderPostcard> getAllOrdersForCity(String city) {
        return this.orderPostcardRepository.findAllByCity(city);
    }

    @Override
    public OrderPostcard getOrder(String id) {
        return this.orderPostcardRepository.findById(id).orElseThrow(InvalidOrderNotFoundException::new);
    }

    @Override
    public void deleteById(String id) {
        this.orderPostcardRepository.deleteById(id);
    }

    @Override
    public void changeOrderStatus(String id, String status) {
        OrderPostcard orderOnline = this.orderPostcardRepository.findById(id).orElseThrow(InvalidOrderNotFoundException::new);
        orderOnline.setStatus(status);
        this.orderPostcardRepository.save(orderOnline);
    }
}
