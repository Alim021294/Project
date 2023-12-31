package com.springdemo2.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdemo2.model.Employee;

@Repository
public interface Mydaorepository extends JpaRepository<Employee, Integer> {
 
}