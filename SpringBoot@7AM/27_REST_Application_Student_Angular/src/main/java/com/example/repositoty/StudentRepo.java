package com.example.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
