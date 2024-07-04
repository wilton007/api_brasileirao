package com.wilton.brasileirao.mappers;

import com.wilton.brasileirao.dtos.ClubeRequestDto;
import com.wilton.brasileirao.dtos.ClubeResponseDto;
import com.wilton.brasileirao.model.Clube;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-04T11:29:17-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class ClubeMapperImpl implements ClubeMapper {

    @Override
    public Clube toClube(ClubeRequestDto requestDto) {
        if ( requestDto == null ) {
            return null;
        }

        Clube clube = new Clube();

        return clube;
    }

    @Override
    public ClubeResponseDto toClubeResponse(Clube clube) {
        if ( clube == null ) {
            return null;
        }

        ClubeResponseDto clubeResponseDto = new ClubeResponseDto();

        return clubeResponseDto;
    }
}
