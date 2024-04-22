package com.workshop.employees.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.workshop.employees.Models.EmployeeModel;

@Repository
public class EmployeeRepository {
    private List <EmployeeModel> employees= new ArrayList<>();

    public List<EmployeeModel> getAllEmployees(){
        return employees;
    }
    public EmployeeModel createEmployee(EmployeeModel employeeModel){
        employees.add(employeeModel);
        return employeeModel;
    }
    public EmployeeModel updateEmployee(EmployeeModel employeeModel){
        for (EmployeeModel existingEmployee : employees) {
            if (existingEmployee.getId().equals(employeeModel.getId())) {
                existingEmployee.setFirstName(employeeModel.getFirstName());
                existingEmployee.setLastName(employeeModel.getLastName());
                existingEmployee.setSalary(employeeModel.getSalary());
                existingEmployee.setEmail(employeeModel.getEmail());
                existingEmployee.setExperienceYears(employeeModel.getExperienceYears());
                existingEmployee.setPhoneNumber(employeeModel.getPhoneNumber());
                return existingEmployee;
            }
        }
        return null;
    }
    public String deleteEmployee(Long id){
        employees.removeIf(x->x.getId().equals(id));
        return "Empleado eliminado: "+id;
    }
    public List<EmployeeModel> getAllEmployeesByEmail(String email){
        List<EmployeeModel> result = new ArrayList<>();
        for (EmployeeModel existingEmployee : employees) {
            if (existingEmployee.getEmail().equalsIgnoreCase(email)) {
                result.add(existingEmployee);
            }
        }
        return result;
    }
    public List<EmployeeModel> getEmployeeById(Long id){
         List<EmployeeModel> result = new ArrayList<>();
        for (EmployeeModel existingEmployee : employees) {
            if (existingEmployee.getId().equals(id)) {
                result.add(existingEmployee);
            }
        }
        return result;
    }
    public List<EmployeeModel> getAllEmployeesBySalary(double salary){
        List<EmployeeModel> result = new ArrayList<>();
        for (EmployeeModel existingEmployee : employees) {
            if (existingEmployee.getSalary()>salary) {
                result.add(existingEmployee);
            }
        }
        return result;
    }
    public List<EmployeeModel> getAllEmployeesByExperience(int experience){
        List<EmployeeModel> result = new ArrayList<>();
        for (EmployeeModel existingEmployee : employees) {
            if (existingEmployee.getExperienceYears()>experience) {
                result.add(existingEmployee);
            }
        }
        return result;
    }
}
