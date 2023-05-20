package com.example.Internshiprepositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.internshipstudents.Student;

public interface Repositary extends JpaRepository<Student, Integer>
{
    List<Student> findByName(String name);
    
    List<Student> findByAddress(String address);
    
    List<Student> findByStd(int std);
    
    List<Student> findByMobileno(double mobileno);
}
