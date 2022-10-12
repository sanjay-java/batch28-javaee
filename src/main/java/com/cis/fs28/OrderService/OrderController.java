package com.cis.fs28.OrderService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "orders", consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class OrderController {

    @GetMapping
    public String getOrder(){
        return "some-name-on the order";
    }

    @PostMapping
    @RequestMapping(consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE},
            produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String createOrder(@RequestBody Order order){

        System.out.println("Recieved an order with name"+ order.getOrderName());

        return "created an order with order Id = 1234";

    }

}
