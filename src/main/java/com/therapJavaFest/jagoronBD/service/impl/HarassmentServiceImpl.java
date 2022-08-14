package com.therapJavaFest.jagoronBD.service.impl;

import com.therapJavaFest.jagoronBD.model.Harassment;
import com.therapJavaFest.jagoronBD.repository.HarassmentRepository;
import com.therapJavaFest.jagoronBD.service.HarassmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HarassmentServiceImpl implements HarassmentService {

   @Autowired
   HarassmentRepository harassmentRepository;

    @Override
    public void save(Harassment harassment) {
        harassmentRepository.save(harassment);
    }

    @Override
    public List<Harassment> findAll() {
        return harassmentRepository.findAll();
    }

}
