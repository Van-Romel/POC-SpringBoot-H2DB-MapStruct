package com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.mapper;

import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.ProductEntity;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.dto.ProductAddDTO;
import com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.dto.ProductRespDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductEntity addDTOToEntity(ProductAddDTO productAddDTO);
    ProductRespDTO entityToRespDTO(ProductEntity productEntity);
}
