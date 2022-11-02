package com.sara.boottest.api.webrestapis;

import com.sara.boottest.mapper.StudentConvertor;
import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.model.student.StudentModel;
import com.sara.boottest.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
