package com.therapJavaFest.jagoronBD.controller;

import com.therapJavaFest.jagoronBD.model.Item;
import com.therapJavaFest.jagoronBD.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tutorials")
public class TutorialsController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public String showTutorials(Model model) {

        List<Item> TutorialsList = itemService.findAllByCategoryId(2L);
        model.addAttribute("tutorialList",TutorialsList);

        return "tutorials";
    }

}
