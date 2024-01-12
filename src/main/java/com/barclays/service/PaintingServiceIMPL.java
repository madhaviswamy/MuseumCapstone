package com.barclays.service;

import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
import com.barclays.repository.ArtistRepository;
import com.barclays.repository.PaintingRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springdoc.core.converters.models.Sort;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class PaintingServiceIMPL implements PaintingService{
    private PaintingRepository paintingRepository;
    @Override
    public List<Painting> findAll() {

        /*List<Painting> paintings = new ArrayList<>();
        Iterable<Painting> paintingsIts = paintingRepository.findAll(Sort.by("name").ascending());
        paintingsIts.forEach(paintings::add);
        return paintings;*/

        return paintingRepository.findAll(Sort.by("name").ascending());
    }

    @Override
    public Painting findById(int id) {
        Optional<Painting> painting = paintingRepository.findById(id);
        return painting.orElseGet(() ->new Painting("Default name: Nothing Found",0, "InValid", "InValid", "InValid"));
    }

    @Override
    public List<Painting> searchByPName(String name) {
        List<Painting> paintings = paintingRepository.searchByPName(name);
        //log.debug("paintings size: "+ paintings.size());
        return paintings;

    }


    @Override
    public List<Painting> findByYearCompleted(int yearCompleted) {
        List<Painting> paintings = paintingRepository.findByYearCompleted(yearCompleted);
        return paintings;
    }
}
