package com.barclays.repository;

import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MuseumRepository extends CrudRepository<Museum, Integer> {
    @Query("SELECT m " +
            "FROM Museum m WHERE m.name LIKE %:name%")
    List<Museum> searchByMName(@Param("name") String name);

    @Query("SELECT m " +
            "FROM Museum m WHERE m.location LIKE %:location%")
    List<Museum> searchByLocation(@Param("location") String location);
}
