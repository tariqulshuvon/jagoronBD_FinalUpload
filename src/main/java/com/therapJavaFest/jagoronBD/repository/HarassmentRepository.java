package com.therapJavaFest.jagoronBD.repository;


import com.therapJavaFest.jagoronBD.model.Harassment;
import com.therapJavaFest.jagoronBD.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HarassmentRepository extends JpaRepository<Harassment, Long> {

}

