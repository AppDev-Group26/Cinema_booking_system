package repositoryTest;

import domain.Cinema;
import factory.CinemaFactory;
import org.junit.jupiter.api.Test;
import repository.CinemaRepository;


import static org.junit.jupiter.api.Assertions.*;

class CinemaRepositoryTest {
    private static CinemaRepository repository = CinemaRepository.getRepository();
    private static Cinema cinema = CinemaFactory.createCinema("A423", "lat: 53.2734 long: -7.77832031","Blue-Route",  "09:00 - 23:30");

    @Test
    void create() {
        Cinema created = repository.create(cinema);
        assertEquals(cinema.getCinemaNumber(), created.getCinemaNumber());
        System.out.println("create:" + created);
    }

    @Test
    void read() {
        Cinema read = repository.read(cinema.getCinemaNumber());
        assertNull(read);
        System.out.println("Read:" + read);
    }

    @Test
    void update() {
        Cinema updated = new Cinema.Builder().setCinemaNumber("OI762")
                .setLocation("lat: 53.2734 long: -7.77832031")
                .setNameOfCinema("Blue-Route")
                .setOperatingHours("09:00 - 23:30")
                .build();
        assertNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(cinema.getCinemaNumber());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}


