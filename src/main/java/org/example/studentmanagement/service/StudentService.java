package org.example.studentmanagement.service;

import date.Student;
import java.util.ArrayList;
import java.util.List;
import org.example.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

  private StudentRepository repository;

  @Autowired
  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public List<Student> searchStudentList() {
    //検索処理
    return repository.search();

    //絞り込みをする。年齢が30代のみを抽出する。
    //抽出したリストをコントローラーに返す。

  }

  public List<Student> searchStudentCourseList() {
    //絞り込み検索で「Javaコース」のコース情報のみを抽出する
    //抽出したリストをコントローラーに返す。
    return repository.searchStudentCourseList();
  }

  public List<Student> searchStudentsIn30s() {

    List<Student> allStudents = repository.search();

    List<Student> result30s = new ArrayList<>();
    for (Student student : allStudents) {
      if (student.getAge() >= 30 && student.getAge() < 40) {
        result30s.add(student);

      }
    }
    return result30s;
  }

  public List<Student> searchStudentjavacourse() {
    List<Student> allStudents = repository.searchStudentCourseList();

    List<Student> resultjavacourse = new ArrayList<>();

    for (Student student : allStudents) {
      if ("Javaコース".equals(student.getCourseName())) {
        resultjavacourse.add(student);
      }
    }
return resultjavacourse;

  }

}