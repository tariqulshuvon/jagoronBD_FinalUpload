package com.therapJavaFest.jagoronBD.service;

import com.therapJavaFest.jagoronBD.model.Harassment;
import com.therapJavaFest.jagoronBD.model.Item;

import java.util.List;
import java.util.Optional;

public interface HarassmentService {

    void save(Harassment harassment);

    List<Harassment> findAll();

}
