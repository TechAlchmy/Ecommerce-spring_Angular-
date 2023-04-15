package com.davi.shop.dto;

import com.davi.shop.entities.Product;

import jakarta.validation.constraints.NotBlank;

public class ProductNameIdDTO {
    
    @NotBlank(message = "'id' should not be empty.")
    private Long id;
    
    @NotBlank(message = "'name' should not be empty.")
    private String name;

    public ProductNameIdDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductNameIdDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public ProductNameIdDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
