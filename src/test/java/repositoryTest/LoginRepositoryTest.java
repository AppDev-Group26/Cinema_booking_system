/*
LoginRepositoryTest.java
Entity for Login
Author: Monehi Tuoane (219350744)
Date: 09 April 2022
*/

package repositoryTest;

import domain.Login;
import factory.LoginFactory;
import org.junit.jupiter.api.Test;
import repository.LoginRepository;

import static org.junit.jupiter.api.Assertions.*;

class LoginRepositoryTest {

    private static LoginRepository repository = LoginRepository.getRepository();
    private static Login login = LoginFactory.createLogin("login@mail.com", "password");



    @Test
    void create() {
        Login created = repository.create(login);
        assertEquals(login.getEmail(), created.getEmail());
        System.out.println("create:" + created);
    }

    @Test
    void read() {
        Login read = repository.read(login.getEmail());
        assertNull(read);
        System.out.println("Read:" + read);
    }


    @Test
    void update() {
        Login updated = new Login.Builder().setEmail("testing@mail.com")
                .setEmail("TESTING@mail.com")
                .setPassword("PASSWORD101")
                .build();
        assertNull(repository.update(updated));
        System.out.println("Updated" + updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(login.getEmail());
        assertTrue(success);
        System.out.println("Deleted:" + success);
    }

    @Test
    void getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}