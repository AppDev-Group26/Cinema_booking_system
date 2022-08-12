/*
CinemaFactoryTest.java
Author: Brandon Lee Kruger (216049245)
Date: 12/08/2022
* */
package factoryTest;

import factory.CinemaFactory;
import org.junit.jupiter.api.Test;
import domain.Cinema;

import static org.junit.jupiter.api.Assertions.*;

class CinemaFactoryTest {

    @Test
    void createCinema() {
        Cinema cinema = CinemaFactory.createCinema("A423", "lat: 53.2734 long: -7.77832031","Blue-Route",  "09:00 - 23:30");
        System.out.println(cinema.toString());
        assertNotNull(cinema);
    }
}