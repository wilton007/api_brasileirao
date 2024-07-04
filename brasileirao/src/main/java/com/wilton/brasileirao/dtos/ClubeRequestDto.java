package com.wilton.brasileirao.dtos;

import com.wilton.brasileirao.enums.EstadoBrasileiroEnum;
import com.wilton.brasileirao.enums.StatusEnum;

import java.time.LocalDate;

public class ClubeRequestDto {
    private String nome;
    private EstadoBrasileiroEnum sigla;
    private LocalDate dataCriacao;
    private StatusEnum status;
}
