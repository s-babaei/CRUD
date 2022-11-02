package com.sara.boottest.model.student;

import com.sara.boottest.model.course.CourseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy ="studentEntities")
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

    public StudentEntity(Long id, String name, Set<CourseEntity> courseEntityset) {
        this.id = id;
        this.name = name;
        this.courseEntityset = courseEntityset;
    }

    public StudentEntity(String name, Set<CourseEntity> courseEntityset) {
        this.name = name;
        this.courseEntityset = courseEntityset;
    }

    public StudentEntity(Long id) {
        this.id = id;
    }

    public StudentEntity() {
    }

    public StudentEntity(String name) {
        this.name = name;
    }
}
