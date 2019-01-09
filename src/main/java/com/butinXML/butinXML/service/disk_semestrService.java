package com.butinXML.butinXML.service;

import com.butinXML.butinXML.entity.disk_semestr;
import com.butinXML.butinXML.repository.disk_semestrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class disk_semestrService {
    @Autowired disk_semestrRepository disk_semestrRepository;

    public List<disk_semestr> findAll() {
        return disk_semestrRepository.findAll();
    }
}
