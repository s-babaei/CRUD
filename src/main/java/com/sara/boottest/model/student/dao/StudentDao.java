package com.sara.boottest.model.student.dao;

import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.student.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentDao extends JpaRepository<StudentEntity,Long> {

    StudentEntity save(StudentEntity studentEntity);

    @Override
    void deleteById(Long aLong);

    @Override
    List<StudentEntity> findAll();

    @Override
    Optional<StudentEntity> findById(Long aLong);



        StudentEntity findByName(String name);


}
