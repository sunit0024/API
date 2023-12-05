package com.myFirstWebApp.myapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String welcomeMethod(ModelMap map){
        map.put("name",getLoggedInUserName());
        return "welcome";
    }

    private String getLoggedInUserName(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
