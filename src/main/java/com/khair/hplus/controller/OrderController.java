package com.khair.hplus.controller;

import com.khair.hplus.domain.Order;
import com.khair.hplus.repository.OrderLineRepository;
import com.khair.hplus.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderLineRepository orderLineRepository;

    @QueryMapping
    public Iterable<Order> orders() {
        return orderRepository.findAll();
    }

    @QueryMapping
    public Order orderById(@Argument String id){
        return orderRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public Iterable<Order> ordersByCustomerEmail(@Argument String customerEmail){
        return orderRepository.findByCustomerEmail(customerEmail);
    }

    @QueryMapping
    public Iterable<Order> ordersByCustomerId(@Argument Long customerId){
        return orderRepository.findByCustomer_Id(customerId);
    }
}
