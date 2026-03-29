package org.example.studentmanagement.repository;

import date.Student;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;



@Mapper
public interface StudentRepository {


  @Select("SELECT * FROM students ")
  List<Student> search();

  @Select("SELECT id, name, furigana, nickname AS nickName, email, area, age, gender, courses_name AS coursesName FROM students_courses")
  List<Student> searchStudentCourseList();


}
