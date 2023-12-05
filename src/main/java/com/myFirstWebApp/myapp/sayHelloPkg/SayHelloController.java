package com.myFirstWebApp.myapp.sayHelloPkg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello S";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My Page title</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append(" This is the body of the html page.");
        sb.append(" </body>");
        sb.append("</html>");
        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
