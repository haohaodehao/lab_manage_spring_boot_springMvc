package com.haohao.labmanagespringboot.repositories;

import com.haohao.labmanagespringboot.entities.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Long> {
    List<Equipment> findByName(String name);
}
