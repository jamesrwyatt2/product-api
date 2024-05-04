package org.jwctech.productapi.modal;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name may not be blank!")
    @Size(min = 4, max = 20, message = "Name must be between 4 and 25 characters!")
    private String name;

    @NotBlank
    private String brand;

    @NotNull
    private float price;

}
