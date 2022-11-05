package com.sara.boottest.service.course;

import com.sara.boottest.model.course.CourseEntity;

import java.util.List;

public interface CourseService {

    CourseEntity save(CourseEntity courseEntity);

    void delete(CourseEntity courseEntity);

     CourseEntity updateCourse(CourseEntity courseEntity);

    List<CourseEntity> getAll();

    CourseEntity getById(Long id);
}
