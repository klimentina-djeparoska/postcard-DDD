package postcardddd.orderpostcard.web.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import postcardddd.orderpostcard.model.OrderPostcard;
import postcardddd.orderpostcard.service.OrderPostcardService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/orders")
public class OrderPostcardApi {

    private final OrderPostcardService orderPostcardService;

    public OrderPostcardApi(OrderPostcardService orderPostcardService) {
        this.orderPostcardService = orderPostcardService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderPostcard saveOrder (@RequestBody OrderPostcard requestOrder,
                                    HttpServletResponse response) {

        OrderPostcard order = this.orderPostcardService.saveOrder(requestOrder.getId(), requestOrder.getUserId(),
                requestOrder.getPostcardId(), requestOrder.getAddress(), requestOrder.getPrice(), requestOrder.getStatus(), requestOrder.getDate());

        response.setHeader("Location", "/api/orders");
        return order;
    }

    @GetMapping(path = "/user")
    public List<OrderPostcard> getOrdersByUserId(@RequestParam String user_uid ) {
        return this.orderPostcardService.getAllOrdersForUser(user_uid);
    }

}
