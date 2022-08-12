/*
LoginRepository.java
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/
package repository;

import domain.Login;
import java.util.HashSet;
import java.util.Set;

public class LoginRepository implements ILoginRepository{

    private static LoginRepository repository = null;
    private Set<Login> loginDB = null;

    private LoginRepository (){loginDB = new HashSet<Login>(); }

    public static LoginRepository getRepository(){
        if(repository == null) {
            repository = new LoginRepository();
        }
        return repository;
    }

    @Override
    public Login create(Login login) {
        boolean success = loginDB.add(login);
        if(!success)
            return null;
        return login;
    }

    @Override
    public Login read(Login ID) {
        return null;
    }


    @Override
    public Login read(String email) {
        Login login = loginDB.stream()
                .filter(p -> p.getEmail().equals(email))
                .findAny()
                .orElse(null);
        return login;
    }

    @Override
    public Login update(Login login) {
        Login oldLogin = read(login.getEmail());
        if(oldLogin != null){
            loginDB.remove(oldLogin);
            loginDB.add(login);
            return login;
        }
        return null;
    }

    @Override
    public boolean delete(String email) {
        Login loginToDelete = read(email);
        if(loginToDelete == null)
            return false;
        loginDB.remove(loginToDelete);
        return true;
    }

    @Override
    public Set<Login> getAll() {
        return loginDB;
    }
}
