package com.vendas.secao3.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vendas.secao3.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer> {
}
