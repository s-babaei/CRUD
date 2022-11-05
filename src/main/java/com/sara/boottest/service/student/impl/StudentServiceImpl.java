package com.sara.boottest.service.student.impl;

import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.model.student.StudentModel;
import com.sara.boottest.model.student.dao.StudentDao;
import com.sara.boottest.service.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public StudentEntity update(StudentEntity studentEntity) {
        return studentDao.save(studentEntity);
        //dont add update in repo just use save!

    }

    @Override
    public List<StudentEntity> getAll() {
       return studentDao.findAll();
    }

    @Override
    public StudentEntity getById(Long id) {
        return studentDao.findById(id).get();
    }

    @Override
    public StudentEntity getByName(StudentEntity studentEntity) {
        return studentDao.findByName(studentEntity.getName());
    }

    @Override
    public StudentEntity add(StudentEntity studentEntity) {
        return studentDao.save(studentEntity);
    }


}
