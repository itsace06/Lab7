package com.inovero.lab_7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// JpaRepository<EntityClass, IdDataType>
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Spring Data can automatically generate a query from the method name:
    List<Product> findByNameContaining(String name);
}