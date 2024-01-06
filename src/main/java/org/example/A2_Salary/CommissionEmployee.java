package org.example.A2_Salary;

public class CommissionEmployee extends Employee{
    protected double baseSalary;
    protected double sale;
    protected double commissionPercentage;

    CommissionEmployee(double baseSalary, double sale, double commission){
        this.baseSalary = baseSalary;
        this.sale = sale;
        this.commissionPercentage = commission;
    }

    @Override
    public double CalculateSalary() {
        return baseSalary + (sale * (commissionPercentage / 100));
    }
}
