package com.wilton.brasileirao.model;

import com.wilton.brasileirao.enums.EstadoBrasileiroEnum;
import com.wilton.brasileirao.enums.StatusEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private EstadoBrasileiroEnum sigla;
    @NotNull
    private LocalDate dataCriacao;
    @NotBlank
    private StatusEnum status;

}
