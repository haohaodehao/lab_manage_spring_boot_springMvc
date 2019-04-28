package com.haohao.labmanagespringboot.controllers;

import com.haohao.labmanagespringboot.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EquipmentController {
    private final EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @GetMapping("/equipments")
    public String equipmentsIndex() {
        return "equipment-index";
    }
}
