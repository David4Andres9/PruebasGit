package com.workshop.employees.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.employees.Models.EmployeeModel;
import com.workshop.employees.Repositories.EmployeeRepository;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeModel> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {
        return employeeRepository.createEmployee(employeeModel);
    }
    public EmployeeModel updateEmployee(EmployeeModel employeeModel) {
        return employeeRepository.updateEmployee(employeeModel);
    }
    public String deleteEmployee(Long id) {
        
        return employeeRepository.deleteEmployee(id);
    }
    public List<EmployeeModel> getAllEmployeesByEmail(String email) {
        return employeeRepository.getAllEmployeesByEmail(email);
    }
    public List<EmployeeModel> getEmployeeById(Long id) {
        return employeeRepository.getEmployeeById(id);
    }
    public List<EmployeeModel> getAllEmployeesBySalary(double salary) {
        return employeeRepository.getAllEmployeesBySalary(salary);
    }
    public List<EmployeeModel> getAllEmployeesByExperience(int experience) {
        return employeeRepository.getAllEmployeesByExperience(experience);
    }
}
