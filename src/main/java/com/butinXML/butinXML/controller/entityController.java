package com.butinXML.butinXML.controller;

import com.butinXML.butinXML.service.disc_planaService;
import com.butinXML.butinXML.service.disk_semestrService;
import com.butinXML.butinXML.service.semestryService;
import com.butinXML.butinXML.service.uch_planyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class entityController {
    @Autowired uch_planyService uch_planyService;
    @Autowired semestryService semestryService;
    @Autowired disc_planaService disc_planaService;
    @Autowired disk_semestrService disk_semestrService;

    @GetMapping("/educational_plans")
    public String geteducational_plans(Model model){
        model.addAttribute("educational_plans_table",uch_planyService.findAll());
        return "educational_plans";
    }

    @GetMapping("/semester")
    public String getsemestry(Model model){
        model.addAttribute("semestrylist",semestryService.findAll());
        return "semestry";
    }

    @GetMapping("/disc_plana")
    public String getdisc_plana(Model model){
        model.addAttribute("disc_plana",disc_planaService.findAll());
        return "disc_plana";
    }
//    disk_semestrRepository
@GetMapping("/disk_semestr")
public String getdisk_semestr(Model model){
    model.addAttribute("disk_semestr",disk_semestrService.findAll());
    return "disk_semestr";
}
}
