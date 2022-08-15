/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;



import domain.Booking;

import java.util.Set;

public interface IBookingRepository extends IRepository<Booking, String> {
    Booking read(String referenceNumber);

    public Set<Booking> getAll();
}
