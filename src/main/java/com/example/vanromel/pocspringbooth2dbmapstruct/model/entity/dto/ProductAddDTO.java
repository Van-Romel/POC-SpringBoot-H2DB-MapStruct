package com.example.vanromel.pocspringbooth2dbmapstruct.model.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductAddDTO {

    private String description;
    private double value;
    private int quantity;
}
