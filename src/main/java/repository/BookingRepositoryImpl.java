/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;
import domain.Booking;
import domain.Cinema;

import java.util.HashSet;
import java.util.Set;

public class BookingRepositoryImpl implements IBookingRepository {
    private static BookingRepositoryImpl repository = null;
    private Set<Booking> bookingDB;
    private Booking booking;

    private BookingRepositoryImpl(){
        this.bookingDB = new HashSet<>();
    }

    public static BookingRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new BookingRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Booking create(Booking booking) {
        this.bookingDB.add(booking);
        return booking;
    }

    @Override
    public Booking read(Booking id) {
        return null;
    }

    @Override
    public Booking read(String referenceNumber) {
       Booking booking = bookingDB.stream()
                .filter(t -> t.getReferenceNumber().equals(referenceNumber))
                .findAny()
                .orElse(null);
        return booking;

    }

    @Override
    public Booking update(Booking booking) {
        Booking oldBooking = read(booking.getReferenceNumber());
        if(oldBooking != null){
            bookingDB.remove(oldBooking);
            bookingDB.add(oldBooking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(String referenceNumber) {
        Booking bookingToDelete = read(referenceNumber);
        if(bookingToDelete == null)
            return false;
        bookingDB.remove(bookingToDelete);
        return true;
    }


    @Override
    public Set<Booking> getAll() {
        return bookingDB;
    }
}
