package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.data.EmployeeData;

public interface EmployeeDao extends JpaRepository<EmployeeData, Integer>{

}
