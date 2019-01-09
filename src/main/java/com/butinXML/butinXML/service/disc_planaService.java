package com.butinXML.butinXML.service;

import com.butinXML.butinXML.entity.disc_plana;
import com.butinXML.butinXML.repository.disc_planaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class disc_planaService {
    @Autowired disc_planaRepository disc_planaRepository;
    public List<disc_plana> findAll(){
        return  disc_planaRepository.findAll();
    }
}
