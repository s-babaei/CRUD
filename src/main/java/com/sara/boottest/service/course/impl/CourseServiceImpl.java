package com.sara.boottest.service.course.impl;

import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.course.dao.CourseDao;
import com.sara.boottest.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public CourseEntity updateCourse(CourseEntity courseEntity) {
        return courseDao.save(courseEntity);
    }

    @Override
    public List<CourseEntity> getAll() {
        return courseDao.findAll();
    }

    @Override
    public CourseEntity getById(Long id) {
        return courseDao.findById(id).get();
        //because of get by id
    }


}
