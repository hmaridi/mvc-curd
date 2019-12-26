package com.mvc.repository;

import java.util.List;

import com.mvc.model.Employee;

public interface EmployeeRepository {

	public void addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public void deleteEmployee(Integer employeeId);

	public Employee updateEmployee(Employee employee);

	public Employee getEmployee(int employeeid);
}
