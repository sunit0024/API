package com.myFirstWebApp.myapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean Authenticate(String name,String password){
        return name.equals("Y") && password.equals("1");
    }
}
