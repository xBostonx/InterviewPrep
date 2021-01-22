package com.geekbrains.studentservice.repositories;

import com.geekbrains.studentservice.entities.Student;
import com.geekbrains.studentservice.entities.dtos.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<StudentDto> findAllBy();
}
