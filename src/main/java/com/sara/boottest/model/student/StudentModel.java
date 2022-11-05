package com.sara.boottest.model.student;


import com.sara.boottest.model.course.CourseEntity;
import lombok.*;

import java.util.Set;


public class StudentModel {

    private Long id;
    private String name;
    private Set<CourseEntity> courseEntityset;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CourseEntity> getCourseEntityset() {
        return courseEntityset;
    }

    public void setCourseEntityset(Set<CourseEntity> courseEntityset) {
        this.courseEntityset = courseEntityset;
    }

    public StudentModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentModel(Long id) {
        this.id = id;
    }

    public StudentModel(String name) {
        this.name = name;
    }

    public StudentModel(Set<CourseEntity> courseEntityset) {
        this.courseEntityset = courseEntityset;
    }

    public StudentModel() {
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseEntityset=" + courseEntityset +
                '}';
    }
}
