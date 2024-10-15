package com.SpringMVC.StudentManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringMVC.StudentManagementSystem.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
// no need to add JpaRepository annotation