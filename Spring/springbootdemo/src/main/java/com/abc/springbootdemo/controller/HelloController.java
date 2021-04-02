package com.abc.springbootdemo.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abc.springbootdemo.bean.Employee;
 
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
//    	System.out.println("inside controller");
//        String message ="<h1>Welcome to Spring Rest Api</h1>";
        return "Hello";
    }
//    @RequestMapping(value="/welcome",method=RequestMethod.GET)
//    public ModelAndView get(ModelAndView mp)
//    {
//    	return new ModelAndView();
//    }

    @GetMapping("/emp")
    public Employee fetchEmployee() {
        Employee emp = new Employee();
        emp.setEmpId("E101");
        emp.setName("Raj");
        emp.setAge(25);

        return emp;
    }
    @GetMapping("/emp/list")
    public List<Employee> fetchAllEmployee() {
    	Employee emp = new Employee();
        emp.setEmpId("E101");
        emp.setName("Raj");
        emp.setAge(25);

        Employee emp2 = new Employee();
        emp2.setEmpId("E101");
        emp2.setName("Raj");
        emp2.setAge(25);

        Employee emp3 = new Employee();
        emp3.setEmpId("E101");
        emp3.setName("Raj");
        emp3.setAge(25);

        List<Employee> empList = new ArrayList<>();
        empList.add(emp3);
        empList.add(emp);
        empList.add(emp2);    

        return empList;
    } 
}