package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.ReturnMailLogRepository;
import com.practice.systemmanager.models.ReturnMailLog;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("return-mail-log")
public class ReturnMailLogController {

    @Autowired
    private ReturnMailLogRepository returnMailLogRepository;

    @GetMapping("")
    public String displayReturnMailLogPage(Model model) {
        model.addAttribute("returnMailLogList", returnMailLogRepository.findAll());
        return "return-mail/index";
    }

    @GetMapping("/add")
    public String displayReturnMailLogForm(Model model) {
        model.addAttribute(new ReturnMailLog());
        return "return-mail/add";
    }

    @PostMapping("/add")
    public String addReturnMailLog(@ModelAttribute @Valid ReturnMailLog returnMailLog, Errors errors) {
        if (errors.hasErrors()) {
            return "return-mail/add";
        } else {
            returnMailLogRepository.save(returnMailLog);
            return "redirect:/return-mail-log";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteReturnMailLogForm(Model model) {
        model.addAttribute("returnMailLogList", returnMailLogRepository.findAll());
        return "return-mail/delete";
    }

    @PostMapping("/delete")
    public String processDeleteReturnMailForm(@RequestParam(required = false) int[] returnMailIds) {
        if (returnMailIds != null) {
            for (int id : returnMailIds) {
                returnMailLogRepository.deleteById(id);
            }
        }
        return "redirect:/return-mail-log";
    }
}
