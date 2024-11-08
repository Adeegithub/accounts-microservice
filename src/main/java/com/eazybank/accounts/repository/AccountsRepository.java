package com.eazybank.accounts.repository;

import com.eazybank.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //JPA Framework will create a Bean interface under the hood.
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long aLong);

    @Transactional //When transaction fails in runtime partially modified data will roll back by the Spring Data JPA
    @Modifying //Tell the Spring framework that this method is going to modify the data,
    //So please execute this query inside a transaction.
    void deleteByCustomerId(long customerId);
}
