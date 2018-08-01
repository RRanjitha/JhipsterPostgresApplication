package com.bookstore.service.mapper;

import com.bookstore.domain.*;
import com.bookstore.service.dto.ZonalDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Zonal and its DTO ZonalDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ZonalMapper extends EntityMapper<ZonalDTO, Zonal> {


    @Mapping(target = "zonalSectors", ignore = true)
    Zonal toEntity(ZonalDTO zonalDTO);

    default Zonal fromId(Long id) {
        if (id == null) {
            return null;
        }
        Zonal zonal = new Zonal();
        zonal.setId(id);
        return zonal;
    }
}
