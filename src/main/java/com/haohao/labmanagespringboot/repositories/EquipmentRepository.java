package com.haohao.labmanagespringboot.repositories;

import com.haohao.labmanagespringboot.entities.Equipment;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface EquipmentRepository extends DataTablesRepository<Equipment, Long> {
//    List<Equipment> findByName(String name);
}
