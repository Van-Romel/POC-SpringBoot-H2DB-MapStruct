package com.example.vanromel.pocspringbooth2dbmapstruct.api.controller;

import com.example.vanromel.pocspringbooth2dbmapstruct.api.service.ProductService;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.ProductEntity;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.dto.ProductAddDTO;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.dto.ProductRespDTO;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("product")
public class ProductController {

    ProductService productService;
    ProductMapper productMapper;

    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping
    public ResponseEntity<List<ProductRespDTO>> findAllProducts() {
        return ResponseEntity.ok(productService.findAllProducts().stream()
                .map(productMapper::entityToRespDTO).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductAddDTO productAddDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                productService.saveProduct(
                        productMapper.addDTOToEntity(productAddDTO)));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllProducts() {
        try {
            productService.deleteAll();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
