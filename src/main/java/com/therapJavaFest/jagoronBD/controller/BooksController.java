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
@RequestMapping("/Books")

public class BooksController {
    @Autowired
    ItemService itemService;

    @GetMapping
    public String showBooks(Model model) {

        List<Item> bookList = itemService.findAllByCategoryId(1L);
        model.addAttribute("bookList",bookList);

        return "Books";
    }
}
