/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package factory;


import domain.Booking;
public class BookingFactory {
    public static Booking createBooking(String referenceNumber,
                                        int beverageNumber,
                                        String date,
                                        String Time,
                                        String location,
                                        int foodNumber) {

        return new Booking.Builder().setBeverageNumber(beverageNumber)
                .setReferenceNumber(referenceNumber)
                .setDate(date)
                .setTime(Time)
                .setLocation(location)
                .setFoodNumber(foodNumber)
                .setBeverageNumber(beverageNumber)
                .build();
    }
}