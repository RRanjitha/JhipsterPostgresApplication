package com.bookstore.service.mapper;

import com.bookstore.domain.Sector;
import com.bookstore.domain.Zonal;
import com.bookstore.service.dto.SectorDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-31T18:39:01+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"
)
@Component
public class SectorMapperImpl implements SectorMapper {

    @Autowired
    private ZonalMapper zonalMapper;

    @Override
    public List<Sector> toEntity(List<SectorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Sector> list = new ArrayList<Sector>( dtoList.size() );
        for ( SectorDTO sectorDTO : dtoList ) {
            list.add( toEntity( sectorDTO ) );
        }

        return list;
    }

    @Override
    public List<SectorDTO> toDto(List<Sector> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SectorDTO> list = new ArrayList<SectorDTO>( entityList.size() );
        for ( Sector sector : entityList ) {
            list.add( toDto( sector ) );
        }

        return list;
    }

    @Override
    public SectorDTO toDto(Sector sector) {
        if ( sector == null ) {
            return null;
        }

        SectorDTO sectorDTO = new SectorDTO();

        Long id = sectorZonalId( sector );
        if ( id != null ) {
            sectorDTO.setZonalId( id );
        }
        String name = sectorZonalName( sector );
        if ( name != null ) {
            sectorDTO.setZonalName( name );
        }
        sectorDTO.setId( sector.getId() );
        sectorDTO.setName( sector.getName() );
        sectorDTO.setDate( sector.getDate() );
        sectorDTO.setContent( sector.getContent() );

        return sectorDTO;
    }

    @Override
    public Sector toEntity(SectorDTO sectorDTO) {
        if ( sectorDTO == null ) {
            return null;
        }

        Sector sector = new Sector();

        sector.setZonal( zonalMapper.fromId( sectorDTO.getZonalId() ) );
        sector.setId( sectorDTO.getId() );
        sector.setName( sectorDTO.getName() );
        sector.setDate( sectorDTO.getDate() );
        sector.setContent( sectorDTO.getContent() );

        return sector;
    }

    private Long sectorZonalId(Sector sector) {
        if ( sector == null ) {
            return null;
        }
        Zonal zonal = sector.getZonal();
        if ( zonal == null ) {
            return null;
        }
        Long id = zonal.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String sectorZonalName(Sector sector) {
        if ( sector == null ) {
            return null;
        }
        Zonal zonal = sector.getZonal();
        if ( zonal == null ) {
            return null;
        }
        String name = zonal.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
