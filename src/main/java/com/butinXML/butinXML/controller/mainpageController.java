package com.butinXML.butinXML.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainpageController {

    @GetMapping("/")
    public String getMainPage(Model model){
        model.addAttribute("message","Hello");
        return "index";
    }
}
