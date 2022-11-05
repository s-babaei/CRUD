package com.sara.boottest.api.webrestapis;


import com.sara.boottest.mapper.CourseConvertor;
import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.course.CourseModel;
import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseRestController {

    @Autowired
    CourseService courseService;
    @Autowired
    CourseConvertor courseConvertor;

    @PostMapping("/save")
    public CourseModel saveCourse(@RequestBody CourseModel courseModel) {
        System.out.println();
        return courseConvertor.entityToModelConvertor
                (courseService.save(courseConvertor.modelToEntityConvertor(courseModel)));
    }

    @DeleteMapping("/delete/{id}")

    public String deleteCourse(@PathVariable("id") Long id) {
        CourseEntity courseEntity = new CourseEntity(id);
        try {
            courseService.delete(courseEntity);
        } catch (Exception e) {

            return "student not found!";
        }
        return "course remove successfully!";
    }

    @PutMapping("/update")
    public CourseModel updateCourse(@RequestBody CourseModel courseModel) {
        CourseEntity courseEntity = courseConvertor.modelToEntityConvertor(courseModel);
        CourseEntity courseEntity1 = courseService.updateCourse(courseEntity);
        return courseConvertor.entityToModelConvertor(courseEntity1);
    }

    @GetMapping("/getAll")
    public List<CourseModel> getAllCourses() {
        List<CourseEntity> courseEntities = courseService.getAll();
        List<CourseModel> courseModels = new ArrayList<>();
        for (CourseEntity courseEntity : courseEntities) {
            CourseModel courseModel = courseConvertor.entityToModelConvertor(courseEntity);
            courseModels.add(courseModel);


        }
        return courseModels;

    }

    @GetMapping("/get/{id}")
    public CourseModel getById(@PathVariable ("id") Long id){

       CourseEntity courseEntity=new CourseEntity(id);
        CourseEntity byId = courseService.getById(courseEntity.getId());
        CourseModel courseModel = courseConvertor.entityToModelConvertor(byId);
        return courseModel;


    }
}
