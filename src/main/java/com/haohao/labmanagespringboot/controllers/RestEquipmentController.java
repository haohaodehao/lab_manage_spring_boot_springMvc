package com.haohao.labmanagespringboot.controllers;

import com.haohao.labmanagespringboot.entities.Equipment;
import com.haohao.labmanagespringboot.repositories.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RestEquipmentController {
    private EquipmentRepository equipmentRepository;

    @Autowired
    public RestEquipmentController(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @RequestMapping(value = "/data/equipments", method = RequestMethod.GET)
    public DataTablesOutput<Equipment> list(@Valid DataTablesInput input) {
        return equipmentRepository.findAll(input);
    }
}
