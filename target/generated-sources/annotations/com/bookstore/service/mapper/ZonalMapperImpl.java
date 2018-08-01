package com.bookstore.service.mapper;

import com.bookstore.domain.Zonal;
import com.bookstore.service.dto.ZonalDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-31T18:39:02+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class ZonalMapperImpl implements ZonalMapper {

    @Override
    public ZonalDTO toDto(Zonal entity) {
        if ( entity == null ) {
            return null;
        }

        ZonalDTO zonalDTO = new ZonalDTO();

        zonalDTO.setId( entity.getId() );
        zonalDTO.setName( entity.getName() );
        zonalDTO.setDate( entity.getDate() );

        return zonalDTO;
    }

    @Override
    public List<Zonal> toEntity(List<ZonalDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Zonal> list = new ArrayList<Zonal>( dtoList.size() );
        for ( ZonalDTO zonalDTO : dtoList ) {
            list.add( toEntity( zonalDTO ) );
        }

        return list;
    }

    @Override
    public List<ZonalDTO> toDto(List<Zonal> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ZonalDTO> list = new ArrayList<ZonalDTO>( entityList.size() );
        for ( Zonal zonal : entityList ) {
            list.add( toDto( zonal ) );
        }

        return list;
    }

    @Override
    public Zonal toEntity(ZonalDTO zonalDTO) {
        if ( zonalDTO == null ) {
            return null;
        }

        Zonal zonal = new Zonal();

        zonal.setId( zonalDTO.getId() );
        zonal.setName( zonalDTO.getName() );
        zonal.setDate( zonalDTO.getDate() );

        return zonal;
    }
}
