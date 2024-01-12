package com.barclays.IntegrationTest;

import com.barclays.controller.MuseumController;
import com.barclays.controller.PaintingController;
import com.barclays.model.Artist;
import com.barclays.model.Museum;
import com.barclays.model.Painting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PaintingControllerIntegrationTest {

    @Autowired
    PaintingController paintingController;

    @Test
    public void testGetAllPaintings(){
        List<Painting> paintings = paintingController.getAllPaintings();
        assertEquals(3, paintings.size());
    }

    @Test
    public void testGetPainting(){
        Painting painting = paintingController.getPainting(100);
        assertEquals("Starry Nights", painting.getName());
    }
}
