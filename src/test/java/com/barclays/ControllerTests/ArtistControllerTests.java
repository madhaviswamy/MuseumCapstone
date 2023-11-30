package com.barclays.ControllerTests;

import com.barclays.model.Artist;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ArtistControllerTests {

    //Using Rest Template

    @Test
    public void testGetAllArtists(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Artist[]> response =
                restTemplate.getForEntity("http://localhost:8080/artists", Artist[].class);
        Artist[] artists = response.getBody();

        assertEquals(artists.length, 2);
    }

//    @Test
//    public void testGetArtists(){
//
//        RestTemplate restTemplate = new RestTemplate();
//        Artist artist = restTemplate.getForObject("http://localhost:8080/artists/1", Artist.class);
//
//        assertEquals("Vincent Van Gogh", artist.getName());
//    }
}
