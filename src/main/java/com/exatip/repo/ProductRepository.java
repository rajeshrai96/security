package com.exatip.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exatip.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
