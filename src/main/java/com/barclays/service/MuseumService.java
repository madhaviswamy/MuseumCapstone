package com.barclays.service;

import com.barclays.model.Museum;
import com.barclays.model.Painting;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MuseumService {
    List<Museum> findAll();

    List<Museum> searchByMName(String name);

    List<Museum> searchByLocation(String location);
}
