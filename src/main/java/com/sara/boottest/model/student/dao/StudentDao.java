package com.sara.boottest.model.student.dao;

import com.sara.boottest.model.student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentEntity,Long> {

    StudentEntity save(StudentEntity studentEntity);

    @Override
    void deleteById(Long aLong);
}
