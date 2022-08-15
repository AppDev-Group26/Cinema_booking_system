/*
MovieRepositoryTest.java
Entity for Login
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/

package repositoryTest;

import domain.Movie;
import factory.MovieFactory;
import org.junit.jupiter.api.Test;
import repository.MovieRepository;

import static org.junit.jupiter.api.Assertions.*;

class MovieRepositoryTest {

    private static MovieRepository repository = MovieRepository.getRepository();
    private static Movie movie = MovieFactory.createMovie("Peter Pan", "Family","A fairy boy, filled with pixi dust","filterMovie");


    @Test
    void create() {
        Movie created = repository.create(movie);
        assertEquals(movie.getMovieTitle(), created.getMovieTitle());
        System.out.println("create:" + created);
    }

    @Test
    void read() {
        Movie read = repository.read(movie.getMovieTitle());
        assertNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void update() {
        Movie updated = new Movie.Builder().setMovieTitle("Johnny English")
                .setGenre("Action-Comedy")
                .setDescription("Mr Bean is a super spy and is going to save the world from the big bad terrorists")
                .setFilterMovies("Movie Filter By Genre")
                .build();
        assertNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    /*
    @Test
    void delete() {
        boolean success = repository.delete(movie.getDescription());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }
     */


    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}