/*
LoginFactoty.java
Author: Monehi Tuoane (219350744)
Date: 10 April 2022
*/
package factory;

import domain.Login;

public class LoginFactory {

    public static Login createLogin(String email, String password) {

        Login Login = new Login.Builder().setEmail(email).setPassword(password).build();
        return Login;
    }

}
