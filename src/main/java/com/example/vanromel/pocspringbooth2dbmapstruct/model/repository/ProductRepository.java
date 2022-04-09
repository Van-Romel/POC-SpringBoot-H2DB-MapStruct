package com.example.vanromel.pocspringbooth2dbmapstruct.model.repository;

import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
