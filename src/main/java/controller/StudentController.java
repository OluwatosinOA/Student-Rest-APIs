package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/school")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/yoh")
    public String hello(){
        return "Hello Tosin";

    }
    @GetMapping("/food")
    public String chow() {
        return "Sea Food";
    }
    @GetMapping("/males")
    public List<Student> getMalesList(){
        return studentService.getMales();
    }
    @GetMapping("/females")
    public List<Student> getFemlesList(){
        return studentService.getFemales();

    }
    @GetMapping("/test")
    public Student testing(){
        return studentService.testing();

    }
    }



