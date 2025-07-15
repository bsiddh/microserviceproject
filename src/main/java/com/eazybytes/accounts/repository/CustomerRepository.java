package com.eazybytes.accounts.repository;

import com.eazybytes.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//creates the bean of the particular entity class databasee operations
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
