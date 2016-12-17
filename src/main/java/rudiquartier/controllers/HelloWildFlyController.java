package rudiquartier.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RestController
@Controller
@RequestMapping("/")
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, It's me, SpringBoot on Wildfly (3: with webconfig)");
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}