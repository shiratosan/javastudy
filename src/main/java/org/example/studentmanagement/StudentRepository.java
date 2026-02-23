package org.example.studentmanagement;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface StudentRepository {

  @Select("SELECT * FROM students ")
  List<org.example.studentmanagement.Student> search();


}