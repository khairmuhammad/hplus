package com.khair.hplus.controller;

import com.khair.hplus.domain.SalesPerson;
import com.khair.hplus.repository.SalesPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SalesPersonController {

    @Autowired
    private SalesPersonRepository salesPersonRepository;

    @QueryMapping
    public Iterable<SalesPerson> salesPeople() {
        return salesPersonRepository.findAll();
    }
}
