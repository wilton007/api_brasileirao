package com.wilton.brasileirao.dtos;

import lombok.Data;

@Data
public class BaseResponseDto {
    private Integer codigo;
    private String mensagem;
    private Object dados;
}
