package com.butinXML.butinXML.controller;

import com.butinXML.butinXML.service.parserService;
import org.jdom2.JDOMException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
public class mainpageController {
    private final parserService parserService;


    @Autowired
    public mainpageController(parserService parserService) {
        this.parserService = parserService;
    }

    @GetMapping("/")
    public String getMainPage() {
        return "index";
    }

    @PostMapping("/sendfile")
    public String sendFile(@RequestParam(name = "file") MultipartFile file, RedirectAttributes redirectAttributes) {
        try {
            if (parserService.parseFile(file).equals("Success")) {
                redirectAttributes.addFlashAttribute("message", "<div class=\"alert alert-success\" role=\"alert\">\n" +
                        " Успешный запрос\n" +
                        "</div>");
            } else {
                redirectAttributes.addFlashAttribute("message", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
                        " Возникла ошибка\n" +
                        "</div>");
            }
        } catch (JDOMException | IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }
}
