package com.example.store.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductDto {
    @NotBlank(message = "Имя продукта не может быть пустым")
    private String name;
    @NotBlank
    @Size(min = 3, max = 150)
    private String description;
    @NotNull
    private int price;
}
