package com.practice.systemmanager.controllers;


import com.practice.systemmanager.data.WireLogRepository;
import com.practice.systemmanager.models.MethodReceivedBy;
import com.practice.systemmanager.models.WireLog;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("wire-log")
public class WireLogController {

    @Autowired
    private WireLogRepository wireLogRepository;

    @GetMapping("")
    public String displayWireLogPage(Model model) {
        model.addAttribute("wireLogList", wireLogRepository.findAll());
        return "wires/index";
    }

    @GetMapping("/add")
    public String displayAddWireLogForm(Model model) {
        model.addAttribute(new WireLog());
        model.addAttribute("methodReceivedBy", MethodReceivedBy.values());
        return "wires/add";
    }

    @PostMapping("/add")
    public String addWireLog(@ModelAttribute @Valid WireLog wireLog, Errors errors) {
        if (errors.hasErrors()) {
            return "wires/add";
        } else {
            wireLogRepository.save(wireLog);
            return "redirect:/wire-log";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteWireLogForm(Model model) {
        model.addAttribute("wireLogList", wireLogRepository.findAll());
        return "wires/delete";
    }

    @PostMapping("/delete")
    public String processDeleteWireForm(@RequestParam(required = false) int[] wireIds) {
        if (wireIds != null) {
            for (int id : wireIds) {
                wireLogRepository.deleteById(id);
            }
        }
        return "redirect:/wire-log";
    }
}
