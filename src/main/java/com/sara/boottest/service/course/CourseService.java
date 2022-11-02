package com.sara.boottest.service.course;

import com.sara.boottest.model.course.CourseEntity;

public interface CourseService {

    CourseEntity save(CourseEntity courseEntity);

    void delete(CourseEntity courseEntity);
}
