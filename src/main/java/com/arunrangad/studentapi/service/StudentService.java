package com.arunrangad.studentapi.service;

import com.arunrangad.studentapi.entity.Student;
import com.arunrangad.studentapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s){
        return repo.save(s);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Long id, Student updated){
        Student s = repo.findById(id).orElse(null);
        if(s!= null){
            s.setName(updated.getName());

            s.setEmail(updated.getEmail());

            s.setCourse(updated.getCourse());

            s.setMarks(updated.getMarks());
            return repo.save(s);
        }
        return null;
    }

    public void deleteStudent(Long id){
        repo.deleteById(id);
    }
}
