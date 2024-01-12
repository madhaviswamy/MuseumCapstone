package com.barclays.service;

import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
//import org.springdoc.core.converters.models.Sort;
import org.springframework.data.repository.query.Param;

import org.springframework.data.domain.Sort;

import java.util.List;

public interface PaintingService {
    List<Painting> findAll();

    Painting findById(int id);

    List<Painting> searchByPName(String name);

    List<Painting> findByYearCompleted(int yearCompleted);
}
