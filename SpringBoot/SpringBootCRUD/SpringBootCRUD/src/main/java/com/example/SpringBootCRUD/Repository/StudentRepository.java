package com.example.SpringBootCRUD.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootCRUD.Entity.Student;

@Repository                                         // < Entity name , ID - datatype >
public interface StudentRepository extends JpaRepository <Student,Long> {

	List<Student> findByName (String Name);
}
