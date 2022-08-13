/* CinemaRepository.java
   Author: Brandon Kruger (216049245)
   Date: 12/08/2022
*/

package repository;

import domain.Cinema;
import java.util.HashSet;
import java.util.Set;

public class CinemaRepository implements ICinemaRepository{

    private static CinemaRepository repository = null;

    private Set<Cinema> cinemaDB = null;

    private CinemaRepository (){cinemaDB = new HashSet<Cinema>(); }

    public static CinemaRepository getRepository(){
        if(repository == null) {
            repository = new CinemaRepository();
        }
        return repository;
    }

    @Override
    public Cinema create(Cinema cinema){
        boolean success = cinemaDB.add(cinema);
        if(!success)
            return null;
        return cinema;
    }

    @Override
    public Cinema read(Cinema ID) { return null;}

    @Override
    public Cinema read(String cinemaNumber) {
        Cinema cinema = cinemaDB.stream()
                .filter(t -> t.getCinemaNumber().equals(cinemaNumber))
                .findAny()
                .orElse(null);
        return cinema;
    }

    @Override
    public Cinema update(Cinema cinema) {
        Cinema oldCinema = read(cinema.getCinemaNumber());
        if(oldCinema != null){
            cinemaDB.remove(oldCinema);
            cinemaDB.add(cinema);
            return cinema;
        }
        return null;

    }

    @Override
    public boolean delete(String cinemaNumber) {
        Cinema cinemaToDelete = read(cinemaNumber);
        if(cinemaToDelete == null)
            return false;
        cinemaDB.remove(cinemaToDelete);
        return true;
    }


    @Override
    public Set<Cinema> getAll() {
        return cinemaDB;
    }
}

