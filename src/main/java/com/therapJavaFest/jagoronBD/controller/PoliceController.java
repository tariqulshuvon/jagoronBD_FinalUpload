package com.therapJavaFest.jagoronBD.controller;

import com.therapJavaFest.jagoronBD.model.PoliceNumber;
import com.therapJavaFest.jagoronBD.service.PoliceNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/police")
public class PoliceController {

    @Autowired
    PoliceNumberService numberService;


    @GetMapping
    public String showPoliceNumber(Model model) {

        List<PoliceNumber> dhaka = numberService.findAllByDivisionId(1L);
        model.addAttribute("dhaka",dhaka);

        List<PoliceNumber> outsideDhaka = numberService.findAllByDivisionId(2L);
        model.addAttribute("outsideDhaka",outsideDhaka);

        List<PoliceNumber> borishalList = numberService.findAllByDivisionId(3L);
        model.addAttribute("borishalList",borishalList);

        List<PoliceNumber> sylhet = numberService.findAllByDivisionId(4L);
        model.addAttribute("sylhetList", sylhet);

        List<PoliceNumber> chittagong = numberService.findAllByDivisionId(5L);
        model.addAttribute("chittagongList", chittagong);

        List<PoliceNumber> outsideChittagong = numberService.findAllByDivisionId(6L);
        model.addAttribute("outsideChittagongList", outsideChittagong);


        List<PoliceNumber> khulna = numberService.findAllByDivisionId(7L);
        model.addAttribute("khulnaList", khulna);

        List<PoliceNumber> outsideKhulna = numberService.findAllByDivisionId(8L);
        model.addAttribute("outsideKhulnaList", outsideKhulna);


        List<PoliceNumber> rajshahi = numberService.findAllByDivisionId(9L);
        model.addAttribute("rajshahiList", rajshahi);

        List<PoliceNumber> outsideRajshahi = numberService.findAllByDivisionId(10L);
        model.addAttribute("outsideRajshahiList", outsideRajshahi);

        return "police/list";
    }

}
