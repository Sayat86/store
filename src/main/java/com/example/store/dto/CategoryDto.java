package com.example.store.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoryDto {
    @NotBlank(message = "Категория не может быть пустой")
    private String name;
}
