package com.practice.systemmanager.controllers;

import com.practice.systemmanager.data.EmployeeRepository;
import com.practice.systemmanager.models.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("")
    public String displayEmployeePage(Model model) {
        model.addAttribute("employeeList", employeeRepository.findAll());
        return "employee/index";
    }

    @GetMapping("/add")
    public String displayAddEmployeeForm(Model model) {
        model.addAttribute(new Employee());
        // model.addAttribute("methodsReceivedBy", MethodReceivedBy.values());
        return "employee/add";
    }

    @PostMapping("/add")
    public String processAddEmployeeForm(@ModelAttribute @Valid Employee employee, Errors errors) {
        if (errors.hasErrors()) {
            return "employee/add";
        } else {
            employeeRepository.save(employee);
            return "redirect:/employee";
        }
    }

    @GetMapping("/delete")
    public String displayDeleteEmployeeForm(Model model) {
        model.addAttribute("employeeList", employeeRepository.findAll());
        return "employee/delete";
    }

    @PostMapping("/delete")
    public String processDeleteEmployeeForm(@RequestParam(required = false) int[] employeeIds) {
        if (employeeIds != null) {
            for (int id : employeeIds) {
                employeeRepository.deleteById(id);
            }
        }
        return "redirect:/employee";
    }
}
