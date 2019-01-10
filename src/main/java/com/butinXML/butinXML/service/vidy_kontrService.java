package com.butinXML.butinXML.service;

import com.butinXML.butinXML.entity.vidy_kontr;
import com.butinXML.butinXML.repository.vidy_kontrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class vidy_kontrService {
    @Autowired vidy_kontrRepository vidy_kontrRepository;

    public List<vidy_kontr> findAll(){
        return vidy_kontrRepository.findAll();
    }
}
