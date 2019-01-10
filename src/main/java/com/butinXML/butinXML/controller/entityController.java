package com.butinXML.butinXML.controller;

import com.butinXML.butinXML.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class entityController {
    private final uch_planyService uch_planyService;
    private final semestryService semestryService;
    private final disc_planaService disc_planaService;
    private final disk_semestrService disk_semestrService;
    private final vidy_kontrService vidy_kontrService;

    @Autowired
    public entityController(uch_planyService uch_planyService, semestryService semestryService, disc_planaService disc_planaService, disk_semestrService disk_semestrService, vidy_kontrService vidy_kontrService) {
        this.uch_planyService = uch_planyService;
        this.semestryService = semestryService;
        this.disc_planaService = disc_planaService;
        this.disk_semestrService = disk_semestrService;
        this.vidy_kontrService = vidy_kontrService;
    }

    @GetMapping("/educational_plans")
    public String geteducational_plans(Model model) {
        model.addAttribute("educational_plans_table", uch_planyService.findAll());
        return "educational_plans";
    }

    @GetMapping("/semester")
    public String getsemestry(Model model) {
        model.addAttribute("semestrylist", semestryService.findAll());
        return "semestry";
    }

    @GetMapping("/disc_plana")
    public String getdisc_plana(Model model) {
        model.addAttribute("disc_plana", disc_planaService.findAll());
        return "disc_plana";
    }

    @GetMapping("/disk_semestr")
    public String getdisk_semestr(Model model) {
        model.addAttribute("disk_semestry", disk_semestrService.findAll());
        return "disk_semestr";
    }

    @GetMapping("/vidy_kontr")
    public String getvidy_kontr(Model model) {
        model.addAttribute("vidy_kontr", vidy_kontrService.findAll());
        return "vidy_kontr";
    }
//    kontr_sem
@GetMapping("/kontr_sem")
public String getkontr_sem(Model model) {
    model.addAttribute("kontr_sem", disk_semestrService.findAll());
    return "kontr_sem";
}
}
