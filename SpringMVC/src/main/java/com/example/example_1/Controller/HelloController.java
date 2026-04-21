package com.example.example_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView sayHello() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("message", "Hello from Spring MVC!");
        return mv;
    }
}
