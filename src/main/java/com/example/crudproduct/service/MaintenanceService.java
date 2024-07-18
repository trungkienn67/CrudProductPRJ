package com.example.crudproduct.service;

import com.example.crudproduct.entity.Maintenance;

import java.util.List;

public interface MaintenanceService {

    List<Maintenance> findAll();

    Maintenance findById(int theId);

    void save(Maintenance theMaintenance);

    void deleteById(int theId);

}
