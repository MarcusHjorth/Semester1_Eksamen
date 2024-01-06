package org.example.A2_Salary;

public class HourlyEmployee extends Employee {
    protected double numberOfHours;
    protected double payPerHour;

    HourlyEmployee(double numberOfHours, double payPerHour){
        this.numberOfHours = numberOfHours;
        this.payPerHour = payPerHour;
    }

    @Override
    public double CalculateSalary() {
        return numberOfHours * payPerHour;
    }
}
