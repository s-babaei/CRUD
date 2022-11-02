package com.sara.boottest.mapper;

import com.sara.boottest.model.student.StudentEntity;
import com.sara.boottest.model.student.StudentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface StudentConvertor {

    StudentEntity modelToEntityConvertor(StudentModel studentModel);
    StudentModel  entityToModelConvertor(StudentEntity studentEntity);


}
