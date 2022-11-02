package com.sara.boottest.api.webrestapis;


import com.sara.boottest.mapper.CourseConvertor;
import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.course.CourseModel;
import com.sara.boottest.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    public String deleteCourse(@PathVariable ("id") Long id){
        CourseEntity courseEntity=new CourseEntity(id);
        try {
        courseService.delete(courseEntity);
    }catch (Exception e){

           return  "student not found!";
        }
        return "course remove successfully!";
        }
}
