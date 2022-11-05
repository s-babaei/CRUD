package com.sara.boottest.model.course.dao;

import com.sara.boottest.model.course.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CourseDao extends JpaRepository<CourseEntity,Long> {

    CourseEntity save(CourseEntity courseEntity);

    @Override
    void deleteById(Long aLong);

    @Override
    List<CourseEntity> findAll();

    @Override
    Optional<CourseEntity> findById(Long aLong);
}
