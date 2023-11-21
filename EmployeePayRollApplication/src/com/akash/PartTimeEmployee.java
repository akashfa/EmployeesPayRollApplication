package com.akash;

public class PartTimeEmployee extends Employee {
    private int workHours;
    private double perHourCharge;
    public PartTimeEmployee(String name,int id,int workHours,double perHourCharge ){
        super(name,id);
        this.workHours=workHours;
        this.perHourCharge=perHourCharge;
    }

    @Override
    public double calcuateSalary() {
        return workHours*perHourCharge;
    }
}
