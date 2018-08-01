package com.bookstore.repository;

import com.bookstore.domain.Zonal;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Zonal entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ZonalRepository extends JpaRepository<Zonal, Long> {

}
