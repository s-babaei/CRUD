package com.sara.boottest.model.course;


import com.sara.boottest.model.student.StudentEntity;
import lombok.*;

import javax.persistence.*;
import javax.xml.soap.Name;
import java.util.Set;


@Entity
@Table(name ="course")
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JoinTable(name ="student_course",
            joinColumns ={
            @JoinColumn(name="idcourse_id",referencedColumnName ="id")}
            ,inverseJoinColumns =
            {@JoinColumn(name="student_id",referencedColumnName ="id")}
    )
    @ManyToMany
    private Set<StudentEntity> studentEntities;

    public CourseEntity(Long id, String name, Set<StudentEntity> studentEntities) {
        this.id = id;
        this.name = name;
        this.studentEntities = studentEntities;
    }

    public CourseEntity(String name, Set<StudentEntity> studentEntities) {
        this.name = name;
        this.studentEntities = studentEntities;
    }

    public CourseEntity(String name) {
        this.name = name;
    }

    public CourseEntity() {
    }

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

    public Set<StudentEntity> getStudentEntities() {
        return studentEntities;
    }

    public void setStudentEntities(Set<StudentEntity> studentEntities) {
        this.studentEntities = studentEntities;
    }

    public CourseEntity(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CourseEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", studentEntities=" + studentEntities +
                '}';
    }
}
