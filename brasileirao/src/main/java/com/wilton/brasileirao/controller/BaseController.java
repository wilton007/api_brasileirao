package com.wilton.brasileirao.controller;

import com.wilton.brasileirao.dtos.BaseResponseDto;
import com.wilton.brasileirao.dtos.ClubeResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseController {
    static final String SUCESSO = "sucesso!";
    static final String ERRO = "erro!";
    static final String CREATED = "created";

    static ResponseEntity<BaseResponseDto> created(ClubeResponseDto clubeResponseDto){
        BaseResponseDto responseDto = new BaseResponseDto();
        responseDto.setCodigo(HttpStatus.CREATED.value());
        responseDto.setDados(clubeResponseDto);
        responseDto.setMensagem(SUCESSO);
        return ResponseEntity.ok(responseDto);
    }
}
