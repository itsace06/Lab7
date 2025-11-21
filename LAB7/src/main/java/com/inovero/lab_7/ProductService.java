package com.deguia.lab_7;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private Product prod1 = new Product(1L, "Product 1", 50.00);
    private Product prod2 = new Product(2L, "Product 2", 60.00);
    private Product prod3 = new Product(3L, "Product 3", 70.00);

    private List<Product> productList = Arrays.asList(prod1, prod2, prod3);

    public List<Product> getAllProducts() {
        return productList;
    }

    public Object getProductById(Long id) {
        for(Product product : productList) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product saveUser(Product product) {
        productList.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product productDetails) {
        for(Product product : productList) {
            if(product.getId() == id) {
                product.setId(productDetails.getId());
                product.setName(productDetails.getName());
                product.setPrice(productDetails.getPrice());
                return product;
            }
        }
        return null;
    }
    
}
