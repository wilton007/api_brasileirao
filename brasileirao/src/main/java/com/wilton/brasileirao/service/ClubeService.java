package com.wilton.brasileirao.service;

import com.wilton.brasileirao.dtos.ClubeRequestDto;
import com.wilton.brasileirao.dtos.ClubeResponseDto;
import com.wilton.brasileirao.mappers.ClubeMapper;
import com.wilton.brasileirao.model.Clube;
import com.wilton.brasileirao.repository.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubeService {

    @Autowired
    private ClubeRepository repository;
    @Autowired
    private ClubeMapper mapper;


    public ClubeResponseDto cadastrarClube(ClubeRequestDto requestDto){
        Clube clube = mapper.toClube(requestDto);
        ClubeResponseDto responseDto =  mapper.toClubeResponse(clube);
        responseDto.setMensagem("time cadastrado com sucesso!");
        return  responseDto;
    }
}
