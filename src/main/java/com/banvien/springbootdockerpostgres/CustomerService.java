package com.banvien.springbootdockerpostgres;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo;

    public List<Customer> findAll() {
        return repo.findAll();
    }
}
