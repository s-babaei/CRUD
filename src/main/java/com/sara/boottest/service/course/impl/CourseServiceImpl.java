package com.sara.boottest.service.course.impl;

import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.course.dao.CourseDao;
import com.sara.boottest.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseDao courseDao;

    @Override
    public CourseEntity save(CourseEntity courseEntity) {
        return courseDao.save(courseEntity);
    }

    @Override
    public void delete(CourseEntity courseEntity) {
        courseDao.delete(courseEntity);
    }
}
