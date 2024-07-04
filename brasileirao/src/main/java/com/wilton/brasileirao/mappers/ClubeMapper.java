package com.wilton.brasileirao.mappers;

import com.wilton.brasileirao.dtos.ClubeRequestDto;
import com.wilton.brasileirao.dtos.ClubeResponseDto;
import com.wilton.brasileirao.model.Clube;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClubeMapper {

    Clube toClube(ClubeRequestDto requestDto);

    ClubeResponseDto toClubeResponse(Clube clube);
}

