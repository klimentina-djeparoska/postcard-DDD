package postcardddd.orderpostcard.web.rest;

import org.springframework.web.bind.annotation.*;
import postcardddd.orderpostcard.domain.model.Address;
import postcardddd.orderpostcard.service.AddressService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "/api/addresses")
public class AddressApi {

    private final AddressService addressService;

    public AddressApi(AddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping(path = "/save")
    public Address saveAddress(@RequestBody  Address address,
                               HttpServletResponse response) {

        Address address1 = this.addressService.saveAddress(address.getId(), address.getUserId(), address.getStreet(),
                address.getCity(), address.getCountry(), address.getPostalCode());
        response.setHeader("Location", "/api/address/save");

        return address1;
    }

    @GetMapping("/all")
    public List<Address> getAddressesForUser(@RequestParam String userId) {
        System.out.println("getADDRESS called");
        return this.addressService.getAllAddressesForUser(userId);
    }

    @GetMapping
    public Address getAddress(@RequestParam String id) {
        return this.addressService.getAddress(id);
    }

    @DeleteMapping("/deleteById")
    public void deleteAddress(@RequestParam String id) {
        this.addressService.deleteAddress(id);
    }
}
