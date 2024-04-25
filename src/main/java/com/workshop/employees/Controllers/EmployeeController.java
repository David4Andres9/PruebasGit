package com.workshop.employees.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.employees.Models.EmployeeModel;
import com.workshop.employees.Services.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping ("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getEmployees")
    public List<EmployeeModel> getEmployees(){
        return employeeService.getAllEmployees();
    }
    @PostMapping("/addEmployee")
    public EmployeeModel addEmployee(@RequestBody  EmployeeModel employeeModel){
        return employeeService.createEmployee(employeeModel);
    }   
    @PutMapping("/updateEmployee")
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.updateEmployee(employeeModel);
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
    @GetMapping("/getEmployeesByEmail/{email}")
    public List<EmployeeModel> getEmployeesByEmail(@PathVariable String email){
        return employeeService.getAllEmployeesByEmail(email);
    }
    @GetMapping("/getEmployeeById/{id}")
    public List<EmployeeModel> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/getEmployeesBySalary/{salary}")
    public List<EmployeeModel> getEmployeesBySalary(@PathVariable double salary){
        return employeeService.getAllEmployeesBySalary(salary);
    }
    @GetMapping("/getEmployeesByExperience/{experience}")
    public List<EmployeeModel> getEmployeesByExperience(@PathVariable int experience){
        return employeeService.getAllEmployeesByExperience(experience);
    }
    
    @GetMapping("prueba")
    public String prueba() {
        return "Hola que hace";
    }
    
}
