package com.therapJavaFest.jagoronBD.controller;

import com.therapJavaFest.jagoronBD.form.CategoryForm;
import com.therapJavaFest.jagoronBD.form.HarassmentForm;
import com.therapJavaFest.jagoronBD.model.Category;
import com.therapJavaFest.jagoronBD.model.Harassment;
import com.therapJavaFest.jagoronBD.model.Item;
import com.therapJavaFest.jagoronBD.service.HarassmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/harassment")
public class HarassmentController {

    @Autowired
    HarassmentService harassmentService;


    @GetMapping
    public String showHarassmentReport(Model model) {

        List<Harassment> harassmentList = harassmentService.findAll();
        model.addAttribute("harassment",harassmentList);

        return "harassmentList";
    }

    @GetMapping("/new")
    public String addAComplain(Model model) {
        model.addAttribute("harassment", HarassmentForm.builder().build());
        return "harassmentComplaintForm";
    }


    @PostMapping("/save")
    public String saveHarassmentReport(@ModelAttribute("harassment") HarassmentForm form) {


        harassmentService.save(Harassment.builder()
                .id(form.getId())
                .fullName(form.getFullName())
                        .byWho(form.getByWho())
                        .place(form.getPlace())
                        .email(form.getEmail())
                        .address(form.getAddress())
                        .description(form.getDescription())
                .build());
        return "redirect:/";
    }


}
