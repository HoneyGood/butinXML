package com.butinXML.butinXML.service;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;


@Service
public class parserService {
    final xmlprs xmlprs;

    @Value("${upload.path}")
    private String uploadPath;

    @Autowired
    public parserService(xmlprs xmlprs) {
        this.xmlprs = xmlprs;
    }

    public String parseFile(MultipartFile file) throws IOException, JDOMException {
//if file doesnt exist => create file in directory
        if (file != null && !Objects.requireNonNull(file.getOriginalFilename()).isEmpty()) {
            File uploadDir = new File(uploadPath);
//if directory doesn't exist => create dir
            if (!uploadDir.exists()) {
                uploadDir.mkdir();
            }
//generate random string for new file (file may have similar names)
            String uuidFile = UUID.randomUUID().toString();
            String resultFilename = uuidFile + "." + file.getOriginalFilename();
            file.transferTo(new File(uploadPath + "/" + resultFilename));

//start parsing our file in directory
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(uploadPath + "/" + resultFilename);
            Document document = builder.build(xmlFile);

            xmlprs.uch_plany(document);
            xmlprs.disc_plana(document);
            xmlprs.disk_semestr(document);
            xmlprs.semestry(document);
            return "Success";
        }
        return "Bad";
    }
}
