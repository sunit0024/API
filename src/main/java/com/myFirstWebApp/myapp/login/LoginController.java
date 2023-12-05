package com.myFirstWebApp.myapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginMethod(){
        return "login";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String welcomeMethod(@RequestParam String name,@RequestParam String password,ModelMap map){
        map.put("name",name);
        map.put("password",password);
        if(authenticationService.Authenticate(name,password)){
            return "welcome";
        }
        else{
            map.put("errorMessage","Invalid credentials");
            return "login";
        }
    }

}
