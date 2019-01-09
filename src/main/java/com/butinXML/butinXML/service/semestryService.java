package com.butinXML.butinXML.service;

import com.butinXML.butinXML.entity.semestry;
import com.butinXML.butinXML.repository.semestryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class semestryService {
    private final semestryRepository semestryRepository;


    @Autowired
    public semestryService(semestryRepository semestryRepository) {
        this.semestryRepository = semestryRepository;
    }

    public List<semestry> findAll(){
        return semestryRepository.findAll();
    }
}
