package service;

import model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    //TODO: Hard coded this for testing  will remove once connected to the database
    List<Student> studentList = Arrays.asList(new Student("Tosin","Female",22),
            new Student("Joshua","Male",30),new Student("Gabriel","Male",25),
            new Student("Kathy","Female",21), new Student("Jones","Male",40),
            new Student("Alpha","Male",28)) ;

    public List<Student> getMales(){

        List<Student> males = studentList.stream().filter(student -> student.getGender()
                .equalsIgnoreCase("Male")).collect(Collectors.toList());

        return males;

    }

    public List<Student> getFemales(){

        List<Student> females = studentList.stream().filter(student -> student.getGender()
                .equalsIgnoreCase("Female")).collect(Collectors.toList());

        return females;

    }
    public Student testing(){
        Student student = new Student();
        student.setName("Alpha");
        student.setGender("Male");
        student.setAge(100);


        return student;

    }





}
