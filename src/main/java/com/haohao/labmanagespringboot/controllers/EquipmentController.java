package com.haohao.labmanagespringboot.controllers;

import com.haohao.labmanagespringboot.entities.Equipment;
import com.haohao.labmanagespringboot.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class EquipmentController {
    private final EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @GetMapping("/equipments")
    public String equipmentsIndex() {
        return "equipments/equipment-index";
    }

    @GetMapping("/add-equipment")
    public String showSignUpForm(Equipment equipment) {
        return "equipments/add-equipment";
    }

    @PostMapping("/add-equipment-do")
    public String addUser(@Valid Equipment equipment, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-equipment";
        }

        equipmentRepository.save(equipment);
        model.addAttribute("equipments", equipmentRepository.findAll());
        return "equipments/equipment-index";
    }

    @GetMapping("/edit/{id}/equipment")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Equipment equipment = equipmentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid equipment Id:" + id));
        model.addAttribute("equipment", equipment);
        return "equipments/update-equipment";
    }

    @PostMapping("update/{id}/equipment")
    public String updateUser(@PathVariable("id") long id, @Valid Equipment equipment, BindingResult result, Model model) {
        if (result.hasErrors()) {
            equipment.setId(id);
            return "equipments/update-equipment";
        }

        equipmentRepository.save(equipment);
        model.addAttribute("equipments", equipmentRepository.findAll());
        return "equipments/equipment-index";
    }
}
