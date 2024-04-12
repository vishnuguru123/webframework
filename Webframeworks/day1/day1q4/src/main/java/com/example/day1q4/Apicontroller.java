package com.example.day1q4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.day1q4.controller.model.Address;
@RestController
public class AddressController {
    @GetMapping("/address")
    public Address addressobject(){
        Address obj = new Address();
        obj.setName("vishnu");
        obj.setDoorNo(123);
        obj.setStreetName("Main St");
        obj.setPincode(641026);
        obj.setArea("selvapuram");
        obj.setDistrict("Coimbatore");
        obj.setState("Tamil Nadu");
        obj.setCountry("India");
        return obj;

}
}
