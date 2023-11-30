package com.barclays.service;

import com.barclays.model.Artist;
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

@Service
@Slf4j
@AllArgsConstructor
public class PaintingServiceIMPL implements PaintingService{
    private PaintingRepository paintingRepository;
    @Override
    public List<Painting> findAll() {

        List<Painting> paintings = new ArrayList<>();
        Iterable<Painting> paintingsIts = paintingRepository.findAll();
        paintingsIts.forEach(paintings::add);

        return paintings;
    }

    @Override
    public List<Painting> searchByPName(String name) {
        List<Painting> paintings = paintingRepository.searchByPName(name);
        //log.debug("paintings size: "+ paintings.size());
        return paintings;

    }

    @Override
    public List<Painting> findByNameAndSort(String name, Sort sort) {
        List<Painting> paintings = paintingRepository.findByNameAndSort(name, Sort.by("name").ascending());
        return paintings;
    }
    //tutorials = tutorialRepository.findByTitleAndSort("at", Sort.by("createdAt").descending());
//    @Override
//    public List<Painting> findByYearCompleted(int yearCompleted) {
//        List<Painting> paintings = paintingRepository.findByYearCompleted(yearCompleted);
//        return paintings;
//    }
}
