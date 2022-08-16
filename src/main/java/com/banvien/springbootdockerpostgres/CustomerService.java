package com.banvien.springbootdockerpostgres;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepo repo;

    @Cacheable(value = "customers")
    public List<Customer> findAll() {
        return repo.findAll();
    }
}
