package com.example.crudproduct.dao;

import com.example.crudproduct.entity.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer> {

    List<Maintenance> findAllByOrderByMaintenanceIdAsc();

}
