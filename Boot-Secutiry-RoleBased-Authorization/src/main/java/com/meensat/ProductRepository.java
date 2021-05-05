package com.meensat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meensat.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
