package com.sara.boottest.service.student;

import com.sara.boottest.model.student.StudentEntity;
import org.springframework.stereotype.Service;


public interface StudentService {

    StudentEntity save(StudentEntity studentEntity);

    void delete(StudentEntity studentEntity);
}
