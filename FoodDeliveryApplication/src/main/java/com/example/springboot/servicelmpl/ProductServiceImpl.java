package com.example.springboot.servicelmpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springboot.exception.ResourceNotFoundException;

import com.example.springboot.model.Product;
import com.example.springboot.repository.ProductRepository;
import com.example.springboot.service.CartService;
import com.example.springboot.service.ProductService;


@Service
public class ProductServiceImpl  implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	
	
	
	@Override
	public Product addProduct(Product product) {
		System.out.println("Product added Succesfully "+product);
		product.setProductname(product.getProductname());
		product.setQuantity(product.getQuantity());
		product.setMrpPrice(product.getMrpPrice());
		product.setDescription(product.getDescription());
		return productRepository.save(product);
	}

	



	@Override
	public Product updateProduct(Product product,long productId) {
		
		Product existingProduct = productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("product","productId",productId));
		existingProduct.setProductname(product.getProductname());
		//existingProduct.setPrice(product.getPrice());
		existingProduct.setMrpPrice(product.getMrpPrice());
		//existingProduct.setImage(product.getImage());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setQuantity(product.getQuantity());
		//existingProduct.setCartId(product.getCartId());

		productRepository.save(existingProduct);
		
		return existingProduct;
		
	}

	@Override
	public void deleteProduct(long productId) {
		productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("product","Id",productId));
		productRepository.deleteById(productId);	
	

	}





	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}





	@Override
	public Product getProductByProductId(long productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("Product","Id",productId));
	}

}