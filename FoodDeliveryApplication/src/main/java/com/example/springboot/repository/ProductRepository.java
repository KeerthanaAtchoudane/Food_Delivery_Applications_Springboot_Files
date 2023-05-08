package com.example.springboot.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.springboot.model.Product;


@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
	public List<Product> findByProductId(long productId);
	//public Product updateProduct(long ProductId);

	


}