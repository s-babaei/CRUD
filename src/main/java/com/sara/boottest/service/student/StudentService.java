package com.sara.boottest.service.student;

import com.sara.boottest.model.student.StudentEntity;

import com.sara.boottest.model.student.StudentModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    StudentEntity save(StudentEntity studentEntity);

    void delete(StudentEntity studentEntity);

    StudentEntity update(StudentEntity studentEntity);

    List<StudentEntity> getAll();

    StudentEntity getById(Long id);

    StudentEntity getByName(StudentEntity studentEntity);

    StudentEntity add(StudentEntity studentEntity);
}
