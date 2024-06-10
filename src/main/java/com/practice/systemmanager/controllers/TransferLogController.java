package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.TransferLogRepository;
import com.practice.systemmanager.models.MethodReceivedBy;
import com.practice.systemmanager.models.TransferLog;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transfer-log")
public class TransferLogController {

    @Autowired
    private TransferLogRepository transferLogRepository;

    @GetMapping("")
    public String displayTransferLogPage(Model model) {
        model.addAttribute("transferLogList", transferLogRepository.findAll());
        return "transfers/index";
    }

    @GetMapping("/add")
    public String displayAddTransferLogForm(Model model) {
        model.addAttribute(new TransferLog());
        model.addAttribute("methodsReceivedBy", MethodReceivedBy.values());
        return "transfers/add";
    }

    @PostMapping("/add")
    public String addTransferLog(@ModelAttribute @Valid TransferLog transferLog, Errors errors) {
        if (errors.hasErrors()) {
            return "transfers/add";
        } else {
            transferLogRepository.save(transferLog);
            return "redirect:/transfer-log";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteTransferLogForm(Model model) {
        model.addAttribute("transferLogList", transferLogRepository.findAll());
        return "transfers/delete";
    }

    @PostMapping("/delete")
    public String processDeleteTransferForm(@RequestParam(required = false) int[] transferIds) {
        if (transferIds != null) {
            for (int id : transferIds) {
                transferLogRepository.deleteById(id);
            }
        }
        return "redirect:/transfer-log";
    }
}
