package com.barclays.IntegrationTest;

import com.barclays.controller.ArtistController;
import com.barclays.controller.MuseumController;
import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.service.MuseumService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class MuseumControllerIntegrationTest {
    @Autowired
    MuseumController museumController;

    @Autowired
    MuseumService museumService;

    @Test
    public void testGetAllMuseums(){
        List<Museum> museums = museumController.getAllMuseums();
        assertEquals(2, museums.size());
    }

    @Test
    public void testFindAll(){
        List<Museum> museums = museumService.findAll();
        assertEquals(2, museums.size());
    }

    @Test
    public void testGetMuseum(){
        Museum museum = museumController.getMuseum(100);
        assertEquals("British Museum", museum.getName());
    }

    @Test
    public void testGetMuseum2(){
        Museum museum = museumController.getMuseum(200);
        assertEquals("Louvre", museum.getName());
    }

//    @Test
//    public void testByName(){
//        List<Museum> museums = museumController.searchByMName("");
//        assertEquals("British Museum", museums.contains(Museum));
//    }
}
