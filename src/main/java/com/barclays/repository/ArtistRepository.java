package com.barclays.repository;

import com.barclays.model.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Integer> {

    //wrong query, look at painting
    @Query("SELECT new Artist(a.name, a.yearBorn, a.yearDown) " +
            "FROM Artist a WHERE a.name LIKE %:name%")
    List<Artist> searchByName(@Param("name") String name);
}
