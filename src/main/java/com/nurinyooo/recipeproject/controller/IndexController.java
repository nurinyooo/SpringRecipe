package com.nurinyooo.recipeproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage(){

        System.out.println("Some message to say ... 12311122245");

        return "index";
    }

}
