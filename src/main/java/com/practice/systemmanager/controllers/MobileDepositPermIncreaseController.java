package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.MobileDepositPermIncreaseRepository;
import com.practice.systemmanager.models.MobileDepositPermIncrease;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mobile-deposit-permanent-increase")
public class MobileDepositPermIncreaseController {

    @Autowired
    private MobileDepositPermIncreaseRepository mobileDepositPermIncreaseRepository;

    @GetMapping("")
    public String displayMobileDepositPermanentIncreasePage(Model model) {
        model.addAttribute("mobileDepositPermanentIncreaseList", mobileDepositPermIncreaseRepository.findAll());
        return "md-perm-increase/index";
    }

    @GetMapping("/add")
    public String displayAddMobileDepositPermanentIncreaseForm(Model model) {
        model.addAttribute(new MobileDepositPermIncrease());
        // model.addAttribute("paymentTypes", PaymentType.values());
        return "md-perm-increase/add";
    }

    @PostMapping("/add")
    public String processAddMobileDepositPermanentIncreaseForm(@ModelAttribute @Valid MobileDepositPermIncrease mobileDepositPermIncrease, Errors errors) {
        if (errors.hasErrors()) {
            return "md-perm-increase/add";
        } else {
            mobileDepositPermIncreaseRepository.save(mobileDepositPermIncrease);
            return "redirect:/mobile-deposit-permanent-increase";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteMobileDepositPermanentIncreaseForm(Model model) {
        model.addAttribute("mobileDepositPermanentIncreaseList", mobileDepositPermIncreaseRepository.findAll());
        return "md-perm-increase/delete";
    }

    @PostMapping("/delete")
    public String processMobileDepositPermanentIncreaseForm(@RequestParam(required = false) int[] mobileDepositPermanentIncreaseIds) {
        if (mobileDepositPermanentIncreaseIds != null) {
            for (int id : mobileDepositPermanentIncreaseIds) {
                mobileDepositPermIncreaseRepository.deleteById(id);
            }
        }
        return "redirect:/mobile-deposit-permanent-increase";
    }
}
