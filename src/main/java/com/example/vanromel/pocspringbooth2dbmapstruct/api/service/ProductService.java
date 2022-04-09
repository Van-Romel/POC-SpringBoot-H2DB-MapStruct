package com.example.vanromel.pocspringbooth2dbmapstruct.api.service;

import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.ProductEntity;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductEntity saveProduct(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    public List<ProductEntity> findAllProducts() {
        return productRepository.findAll();
    }

    public void deleteAll() {
        productRepository.deleteAll();
    }

}
