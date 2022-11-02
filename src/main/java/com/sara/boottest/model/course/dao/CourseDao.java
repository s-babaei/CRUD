package com.sara.boottest.model.course.dao;

import com.sara.boottest.model.course.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<CourseEntity,Long> {

    CourseEntity save(CourseEntity courseEntity);

    @Override
    void deleteById(Long aLong);
}
