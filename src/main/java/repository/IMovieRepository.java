/*
IMovieRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;


import domain.Movie;
import java.util.Set;

public interface IMovieRepository extends IRepository<Movie, String>{

    Movie read(String description);

    public Set<Movie> getAll();
}

