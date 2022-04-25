package com.example.crudspringboot;

import com.example.crudspringboot.Service.StudentService;
import com.example.crudspringboot.domain.Student;
import com.example.crudspringboot.domain.StudentExample;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
class CrudSpringbootApplicationTests {
    @Autowired
    StudentService  studentServicel;
    @Test
    void contextLoads() {
        List<Student> a = studentServicel.searchList();
        System.out.println(a.toString());
    }

    @Test
    void insertRecord(){
        Student student = new Student();
        student.setId("2");
        student.setName("qigo");
        student.setSex("男");
        student.setTell("555555555");
        studentServicel.InserRecord(student);
    }

    @Test
    void updateRecord(){
        studentServicel.updateRecord();
    }

    @Test
    void countRecord()
    {
        System.out.println(studentServicel.count());
    }


    @Test
    void DeleRecord()
    {
        System.out.println(studentServicel.delete());
    }
}
