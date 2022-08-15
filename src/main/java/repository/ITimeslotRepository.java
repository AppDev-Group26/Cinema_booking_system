/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;


import domain.Timeslot;
import domain.Booking;


import java.util.Set;
public interface ITimeslotRepository extends IRepository<Timeslot, String> {
    Timeslot create(Timeslot timeslot);

    public Set<Timeslot> getAll();
}
