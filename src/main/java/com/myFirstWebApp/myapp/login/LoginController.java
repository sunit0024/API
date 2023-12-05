package com.myFirstWebApp.myapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String welcomeMethod(){
        return "welcome";
    }

}
