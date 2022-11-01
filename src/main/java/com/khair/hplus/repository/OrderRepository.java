package com.khair.hplus.repository;

import com.khair.hplus.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByCustomerEmail(String email);
    List<Order> findByCustomer_Id(Long customerId);
}
