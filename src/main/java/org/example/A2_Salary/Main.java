package org.example.Two_Salary;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee>employeesArray = new ArrayList<>();


        Employee monthlyEmployee = new MonthlyEmployee(34000);
        Employee hourlyEmployee = new HourlyEmployee(78.25,240);
        Employee commissionEmployee = new CommissionEmployee(20000, 125000, 20);


        employeesArray.add(monthlyEmployee);
        employeesArray.add(hourlyEmployee);
        employeesArray.add(commissionEmployee);

        for (Employee employee : employeesArray) {

            System.out.println("Employees salary: " + employee.CalculateSalary());
        }
    }
}