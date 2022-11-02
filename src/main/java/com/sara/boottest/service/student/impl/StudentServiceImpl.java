package com.sara.boottest.service.student.impl;

import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.model.student.dao.StudentDao;
import com.sara.boottest.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
       return studentDao.save(studentEntity);
    }

    @Override
    public void delete(StudentEntity studentEntity) {

        studentDao.delete(studentEntity);

    }
}
