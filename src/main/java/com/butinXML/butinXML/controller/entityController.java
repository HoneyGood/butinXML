package com.butinXML.butinXML.controller;

import com.butinXML.butinXML.service.uch_planyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class entityController {
    @Autowired uch_planyService uch_planyService;

    @GetMapping("/educational_plans")
    public String geteducational_plans(Model model){
        model.addAttribute("educational_plans_table",uch_planyService.findAll());
        return "educational_plans";
    }
}
