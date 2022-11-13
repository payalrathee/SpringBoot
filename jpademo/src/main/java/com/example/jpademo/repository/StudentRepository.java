package com.example.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpademo.beans.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
