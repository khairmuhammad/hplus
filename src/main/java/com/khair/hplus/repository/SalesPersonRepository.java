package com.khair.hplus.repository;

import com.khair.hplus.domain.SalesPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesPersonRepository extends JpaRepository<SalesPerson, Long> {
    SalesPerson findByEmail(String email);
}
