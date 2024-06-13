package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.AchReturnItemsRepository;
import com.practice.systemmanager.models.AchReturnItems;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ach-return-items")
public class AchReturnItemsController {


    @Autowired
    private AchReturnItemsRepository achReturnItemsRepository;

    @GetMapping("")
    public String displayAchReturnItemsPage(Model model) {
        model.addAttribute("achReturnItemsList", achReturnItemsRepository.findAll());
        return "ach-return-items/index";
    }

    @GetMapping("/add")
    public String displayAddAchReturnItemsForm(Model model) {
        model.addAttribute(new AchReturnItems());
        // model.addAttribute("paymentTypes", PaymentType.values());
        return "ach-return-items/add";
    }

    @PostMapping("/add")
    public String processAddAchReturnItemsForm(@ModelAttribute @Valid AchReturnItems achReturnItems, Errors errors) {
        if (errors.hasErrors()) {
            return "ach-return-items/add";
        } else {
            achReturnItemsRepository.save(achReturnItems);
            return "redirect:/ach-return-items";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteAchReturnItemsForm(Model model) {
        model.addAttribute("achReturnItemsList", achReturnItemsRepository.findAll());
        return "ach-return-items/delete";
    }

    @PostMapping("/delete")
    public String processDeleteAchReturnItemsForm(@RequestParam(required = false) int[] achReturnItemsIds) {
        if (achReturnItemsIds != null) {
            for (int id : achReturnItemsIds) {
                achReturnItemsRepository.deleteById(id);
            }
        }
        return "redirect:/ach-return-items";
    }
}
