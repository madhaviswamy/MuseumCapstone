package com.barclays.service;

import com.barclays.model.Museum;
import com.barclays.model.Painting;
import com.barclays.repository.MuseumRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class MuseumServiceIMPL implements MuseumService{
    private MuseumRepository museumRepository;
    @Override
    public List<Museum> findAll() {

        List<Museum> museums = new ArrayList<>();
        Iterable<Museum> museumsIts = museumRepository.findAll();
        museumsIts.forEach(museums::add);

        return museums;
    }

    @Override
    public List<Museum> searchByMName(String name) {
        List<Museum> museums = museumRepository.searchByMName(name);
        //log.debug("paintings size: "+ museums.size());
        return museums;
    }

    @Override
    public List<Museum> searchByLocation(String location) {
        List<Museum> museumList = museumRepository.searchByLocation(location);
        return museumList;
    }
}
