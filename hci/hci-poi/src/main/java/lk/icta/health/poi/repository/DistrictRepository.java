package lk.icta.health.poi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.icta.health.poi.entities.District;

/**
 * The District interface is a Spring Data JPA data repository for
 * Province entities. The ProvinceRepository provides all the data access
 * behaviors exposed by <code>JpaRepository</code> and additional custom
 * behaviors may be defined in this interface.
 */
@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

}