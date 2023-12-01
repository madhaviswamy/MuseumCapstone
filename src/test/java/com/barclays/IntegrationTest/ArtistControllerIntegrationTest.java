package com.barclays.IntegrationTest;

import com.barclays.controller.ArtistController;
import com.barclays.model.Artist;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ArtistControllerIntegrationTest {

    @Autowired
    ArtistController artistController;

    @Test
    public void testGetAllArtists(){
        List<Artist> artists = artistController.getAllArtists();
        assertEquals(3, artists.size());
    }

//    @Test
//    public void testGetArtist(){
//        Artist artist = artistController.getArtists(1);
//        assertEquals("Vincent Van Gogh", artist.getName());
//    }
}
