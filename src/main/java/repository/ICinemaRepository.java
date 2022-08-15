/*
ICinemaRepository.java
Author: Brandon Lee Kruger (216049245)
Date: 12/08/2022
* */
package repository;

import domain.Cinema;

import java.util.Set;

public interface ICinemaRepository extends IRepository<Cinema, String> {

    Cinema read(String cinemaNumber);

    public Set<Cinema> getAll();

}

