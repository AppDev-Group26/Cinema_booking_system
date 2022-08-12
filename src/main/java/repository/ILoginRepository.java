/*
ILoginRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;

import domain.Login;
import java.util.Set;

public interface ILoginRepository extends IRepository<Login, String>{

    Login read(String email);

    public Set<Login> getAll();

}
