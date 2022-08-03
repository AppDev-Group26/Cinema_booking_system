/*
CinemaFactory.java
Author: Brandon Lee Kruger (216049245)
Date: 10 April 2022
* */
package factory;

import domain.Cinema;

public class CinemaFactory {

    public static Cinema createCinema(String nameOfCinema, String locationOfCinema, String operatingHoursOfCinema)
    {
        return new Cinema.Builder().setNameOfCinema(nameOfCinema)
                .setLocation(locationOfCinema)
                .setOperatingHours(operatingHoursOfCinema)
                .build();

    }
}
