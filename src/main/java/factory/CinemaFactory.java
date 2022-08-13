package factory;


import domain.Cinema;

public class CinemaFactory {

    public static Cinema createCinema(String cinemaNumber, String location, String nameOfCinema, String operatingHours){
        return new Cinema.Builder().setCinemaNumber(cinemaNumber)
                .setLocation(location)
                .setNameOfCinema(nameOfCinema)
                .setOperatingHours(operatingHours)
                .build();
    }
}