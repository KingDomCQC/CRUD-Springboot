package com.example.crudspringboot.Service;

import com.example.crudspringboot.Mapper.StudentMapper;
import com.example.crudspringboot.domain.Student;
import com.example.crudspringboot.domain.StudentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper   studentMapper;

    StudentExample studentExample = new StudentExample();

    //查
    public List<Student> searchList(){
        //声明 criteria 对象
        StudentExample.Criteria criteria =  studentExample.createCriteria();
        //添加条件
        //criteria.andIdIsNotNull();
        criteria.andNameEqualTo("lyx");
       // System.out.println(studentMapper.selectByExample(studentExample).toString());
        return studentMapper.selectByExample(studentExample);
    }

    //插入
    public int InserRecord(Student  student){
       return studentMapper.insert(student);
    }
    //更新
    public int updateRecord(){
        StudentExample.Criteria criteria = studentExample.createCriteria();

        //条件
        criteria.andIdEqualTo("2");

        //改变的值
        Student student = new Student();
        student.setId("2");
        student.setName("oooo");

        return studentMapper.updateByPrimaryKey(student);
       // return  studentMapper.updateByExampleSelective(student,studentExample);

    }

    //计数
    public long count(){
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andSexIsNotNull();

        return studentMapper.countByExample(studentExample);
    }
    //删除
    public int delete(){
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andSexIsNull();
        return studentMapper.deleteByExample(studentExample);
    }




}
