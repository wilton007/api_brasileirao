package com.wilton.brasileirao.controller;

import com.wilton.brasileirao.dtos.BaseResponseDto;
import com.wilton.brasileirao.dtos.ClubeRequestDto;
import com.wilton.brasileirao.service.ClubeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clube")
public class ClubeController {

    @Autowired
    ClubeService service;

    @PostMapping
    public ResponseEntity<BaseResponseDto> cadastrar(@Valid @RequestBody ClubeRequestDto requestDto){
        return BaseController.created(service.cadastrarClube(requestDto));
    }
}
