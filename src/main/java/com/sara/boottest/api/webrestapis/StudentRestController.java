package com.sara.boottest.api.webrestapis;

import com.sara.boottest.mapper.StudentConvertor;
import com.sara.boottest.model.course.CourseModel;
import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.model.student.StudentModel;
import com.sara.boottest.service.student.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentConvertor studentConvertor;

    @PostMapping("/save")
    public StudentModel saveStudent(@RequestBody StudentModel studentModel) {

   return studentConvertor.entityToModelConvertor
           (studentService.save(studentConvertor.modelToEntityConvertor(studentModel)));


//        System.out.println(studentEntity);
//        System.out.println();
//        return new StudentModel();

    }

    @DeleteMapping("/delete/{id}")

    public String deleteStudent(@PathVariable ("id") Long id){

        StudentEntity studentEntity=new StudentEntity(id);

        try{
            studentService.delete(studentEntity);
        }catch (Exception e){
           return "student not found";
        }
        return "student remove successfully!";

    }


    @PutMapping("/update")
    public StudentModel updateStudent(@RequestBody StudentModel studentModel){
        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(studentModel);
        StudentEntity update=studentService.update(studentEntity);
        StudentModel studentModel1 = studentConvertor.entityToModelConvertor(update);
        return studentModel1;

    }

    @GetMapping("/getAll")
    public List<StudentModel> getAllStudent(){
        List<StudentEntity> all=studentService.getAll();
        List<StudentModel> studentModelList=new ArrayList<>();
        for (StudentEntity studentEntity : all) {
            StudentModel studentModel = studentConvertor.entityToModelConvertor(studentEntity);
            studentModelList.add(studentModel);
        }
        return studentModelList;
        }

    @GetMapping("/get/{id}")
    public StudentModel getById(@PathVariable ("id") Long id) {

        StudentEntity studentEntity = new StudentEntity(id);

        StudentEntity byId = studentService.getById(studentEntity.getId());
        StudentModel studentModel = studentConvertor.entityToModelConvertor(byId);
        return studentModel;


    }
    @PostMapping("/getByName")
    public StudentModel getByName(@RequestBody StudentModel studentModel){

        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(studentModel);
        StudentEntity byName = studentService.getByName(studentEntity);
        StudentModel studentModel1 = studentConvertor.entityToModelConvertor(byName);
        return studentModel1;
    }
    @PostMapping("/getCourse")

    StudentModel addCourse(@RequestBody StudentModel studentModel){





        
//        StudentEntity studentEntity = studentConvertor.modelToEntityConvertor(studentModel);
//        StudentEntity add = studentService.add(studentEntity);
//        StudentModel studentModel1 = studentConvertor.entityToModelConvertor(add);
//        return studentModel1;


    }

    }
