package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.CreditCardLogRepository;
import com.practice.systemmanager.models.CreditCardLog;
import com.practice.systemmanager.models.PaymentType;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/credit-card-log")
public class CreditCardLogController {

    @Autowired
    private CreditCardLogRepository creditCardLogRepository;

    @GetMapping("")
    public String displayCreditCardLogPage(Model model) {
        model.addAttribute("creditCardLogList", creditCardLogRepository.findAll());
        return "credit-card/index";
    }

    @GetMapping("/add")
    public String displayAddCreditCardLogForm(Model model) {
        model.addAttribute(new CreditCardLog());
        model.addAttribute("paymentTypes", PaymentType.values());
        return "credit-card/add";
    }

    @PostMapping("/add")
    public String processAddCreditCardLogForm(@ModelAttribute @Valid CreditCardLog creditCardLog, Errors errors) {
        if (errors.hasErrors()) {
            return "credit-card/add";
        } else {
            creditCardLogRepository.save(creditCardLog);
            return "redirect:/credit-card-log";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteCreditCardLogForm(Model model) {
        model.addAttribute("creditCardLogList", creditCardLogRepository.findAll());
        return "credit-card/delete";
    }

    @PostMapping("/delete")
    public String processDeleteCreditCardForm(@RequestParam(required = false) int[] creditCardIds) {
        if (creditCardIds != null) {
            for (int id : creditCardIds) {
                creditCardLogRepository.deleteById(id);
            }
        }
        return "redirect:/credit-card-log";
    }
}
