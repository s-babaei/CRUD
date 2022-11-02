package com.sara.boottest.model.student;


import lombok.*;


public class StudentModel {

    private Long id;
    private String name;

    public StudentModel(String name) {
        this.name = name;
    }

    public StudentModel() {

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

    public StudentModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
