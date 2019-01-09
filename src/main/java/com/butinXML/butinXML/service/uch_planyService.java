package com.butinXML.butinXML.service;

import com.butinXML.butinXML.entity.uch_plany;
import com.butinXML.butinXML.repository.uch_planyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class uch_planyService {

    @Autowired uch_planyRepository uch_planyRepository;

    public List<uch_plany> findAll(){
        return uch_planyRepository.findAll();
    }

}
