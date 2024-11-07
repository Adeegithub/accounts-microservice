package com.eazybank.accounts.repository;

import com.eazybank.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //JPA Framework will create a Bean interface under the hood.
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
