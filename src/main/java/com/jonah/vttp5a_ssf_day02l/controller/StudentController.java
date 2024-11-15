package com.jonah.vttp5a_ssf_day02l.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jonah.vttp5a_ssf_day02l.model.Student;


@Controller
@RequestMapping("/students")
public class StudentController {
    List<Student> students = new ArrayList<>();

    

    //GetMapping("/allStudents")
    @RequestMapping(path = {"","/students"},method=RequestMethod.GET)
    public String studentListing(Model model) throws ParseException{

        String dob = "18 Dec 1999 10:25:00.000 SGT";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS zzz");
        Date dDob = sdf.parse(dob); //DATE from javautil
        Long epocDob = dDob.getTime();
        
        Student s1 = new Student(1, "Dave", "tan", epocDob, "dave@google.com", "29 road");
        students.add(s1);

        Student s2 = new Student(1, "allen", "ang", epocDob, "allen@google.com", "01010 road");
        students.add(s2);

        //to handle date, use Long and String
        //UI Controller
        //Rest Controller for Data
        //use ResponseBody

        model.addAttribute("students", students);

        return "studentList"; //this will take a studentList HTML from templates
    }
}
