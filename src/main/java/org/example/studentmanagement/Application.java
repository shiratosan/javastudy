
package org.example.studentmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class Application {

  @Autowired
  private org.example.studentmanagement.StudentRepository repository;

  public static void main(String[] args){
    SpringApplication.run(Application.class,args);
  }

  @GetMapping("/studentList")
  public List<org.example.studentmanagement.Student> getStudentList() {
    return repository.search();
  }

}
