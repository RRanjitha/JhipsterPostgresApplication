package com.bookstore.service.mapper;

import com.bookstore.domain.*;
import com.bookstore.service.dto.SectorDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Sector and its DTO SectorDTO.
 */
@Mapper(componentModel = "spring", uses = {ZonalMapper.class})
public interface SectorMapper extends EntityMapper<SectorDTO, Sector> {

    @Mapping(source = "zonal.id", target = "zonalId")
    @Mapping(source = "zonal.name", target = "zonalName")
    SectorDTO toDto(Sector sector);

    @Mapping(source = "zonalId", target = "zonal")
    Sector toEntity(SectorDTO sectorDTO);

    default Sector fromId(Long id) {
        if (id == null) {
            return null;
        }
        Sector sector = new Sector();
        sector.setId(id);
        return sector;
    }
}
