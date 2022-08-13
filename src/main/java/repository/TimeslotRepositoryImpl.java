/*
 *  Name: Siphiwe Edson Chauque
 *  Student Number: 219084777
 *  Group: 26
 *
 */

package repository;

import domain.Timeslot;
import factory.TimeslotFactory;

import java.util.HashSet;
import java.util.Set;

public class TimeslotRepositoryImpl implements ITimeslotRepository {
    private static TimeslotRepositoryImpl repository = null;
    private Set<Timeslot> timeslotDB;

    private TimeslotRepositoryImpl(){
        this.timeslotDB = new HashSet<>();
    }

    public static TimeslotRepositoryImpl getRepository() {
        if (repository == null) {
            repository = new TimeslotRepositoryImpl();
        }
        return repository;
    }

    public static Timeslot createTimeslot(String screeningRoom,double Time, boolean isAvailable) {
        Timeslot timeslot = null;
        return null;
    }

    @Override
    public Timeslot create(Timeslot timeslot) {
        this.timeslotDB.add(timeslot);
        return timeslot;
    }

    @Override
    public Timeslot read(String ScreeningRoom) {
        for (Timeslot time : timeslotDB) {
            if (time.getScreeningRoom().equals(time.isAvailable())) {
                return time;
            }
        }
        return null;
    }

            @Override
            public Timeslot update (Timeslot timeslot){
                Timeslot timeslot1 = TimeslotFactory.createTimeslot(timeslot.getScreeningRoom(), timeslot.getTime(), timeslot.isAvailable());
                if (timeslot1 != null) {
                    timeslotDB.remove(timeslot1);
                    timeslotDB.add(timeslot);
                    return timeslot;
                }
                return null;
            }

    @Override
    public boolean delete(String s) {
        return false;
    }


    public boolean deleteTimeslot (String screeningRoom){
                Timeslot deleteTimeslot1 = read((screeningRoom));
                if (deleteTimeslot1 == null) {
                    System.out.println("Timeslot is null");
                    return false;
                }

                timeslotDB.remove(deleteTimeslot1);
                System.out.println("Timeslot is removed");
                return true;
            }

            @Override
            public Set<Timeslot> getAll () {
                return timeslotDB;
            }
        }
