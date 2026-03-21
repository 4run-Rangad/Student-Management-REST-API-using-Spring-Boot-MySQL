package com.arunrangad.studentapi.repository;

import com.arunrangad.studentapi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Long> {

}
