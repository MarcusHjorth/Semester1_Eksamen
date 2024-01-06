package org.example.A2_Salary;

public class MonthlyEmployee extends Employee {
    protected double salary;

    MonthlyEmployee(double salary){
        this.salary = salary;
    }

    @Override
    public double CalculateSalary() {
        return salary;
    }
}
