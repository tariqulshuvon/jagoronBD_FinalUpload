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
@RequestMapping("/products")

public class ProductsController {

    @Autowired
    ItemService itemService;

    @GetMapping
    public String showproducts(Model model) {

        List<Item> productsList = itemService.findAllByCategoryId(3L);
        model.addAttribute("productList",productsList);

        return "products";
    }
}
