package com.sara.boottest.mapper;

import com.sara.boottest.model.course.CourseEntity;
import com.sara.boottest.model.course.CourseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel ="spring")
public interface CourseConvertor {

    CourseEntity modelToEntityConvertor(CourseModel courseModel);

    CourseModel entityToModelConvertor(CourseEntity courseEntity);
}
