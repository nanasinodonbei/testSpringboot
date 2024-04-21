package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class testController {


    @RequestMapping("/hello")
    public String hello(@RequestParam (value = "name") String name,Model model) {
        model.addAttribute("name",name);

        return "test";
    }

}
