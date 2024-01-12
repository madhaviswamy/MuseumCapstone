package com.barclays.repository;

import com.barclays.model.Artist;
import com.barclays.model.Painting;
import jakarta.websocket.server.PathParam;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaintingRepository extends JpaRepository<Painting, Integer> {
    @Query("SELECT p " +
            "FROM Painting p WHERE p.name LIKE %:name%")
    List<Painting> searchByPName(@Param("name") String name);

    @Query("SELECT y " +
            "FROM Painting y WHERE y.yearCompleted >=?1")
    List<Painting> findByYearCompleted(@PathParam("yearCompleted") int yearCompleted);

}
